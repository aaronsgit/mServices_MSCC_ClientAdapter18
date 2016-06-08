package solutions.legatus.mservice.mscc.client.Request.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ning.http.client.*;
import com.ning.http.client.resumable.ResumableIOExceptionFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntity;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntityID;
import solutions.legatus.mservice.mscc.client.Request.IMsccRestClient;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by ahou on 2/13/2016.
 */
public class AsyncMsccRestClient<T extends  AbstractMsccEntity,ID extends AbstractMsccEntityID > implements IMsccRestClient<T,ID> {

    private static final Logger LOGGER = LoggerFactory.getLogger( AsyncMsccRestClient.class);

    private final static String charSet                  = "utf-8";
    private final static String _CONTENT_TYPE            = "application/json";
    public  static final String _APPLICATION_JSON_UTF8   = "application/json; charset=UTF-8";

    private final static int    HTTP_STATUS_CODE_OK          = 200;
    private final static int    HTTP_STATUS_CODE_CREATED     = 201;
    private final static int    HTTP_STATUS_CODE_ACCEPT      = 202;
    private final static int    HTTP_STATUS_CODE_ERROR       = 500;
    private final static int    HTTP_STATUS_CODE_BADREQUEST  = 404;

    private AsyncHttpClient asyncHttpClient = null;

    private final int timeout = 45 * 60 * 60 * 1000; // 45 minutes


    public AsyncMsccRestClient() {

//        SSLContext context = null;
//        try
//        {
//            context = SSLContext.getInstance( "TLS" );
//            context.init( new KeyManager[] {}, trustManagers, null );
//        }
//        catch ( Exception e )
//        {
//            throw new IllegalStateException( "Impossible to initialize SSL context", e );
//        }

        AsyncHttpClientConfig.Builder builder =
                        new AsyncHttpClientConfig.Builder().setRequestTimeout( timeout )
                                                            .setAllowPoolingConnections( true )
                                                            .addIOExceptionFilter( new ResumableIOExceptionFilter() )
                                                            .setMaxRequestRetry( 3 )
                                                            .setMaxConnectionsPerHost( 10 )
                                                            .setMaxConnections( 100 )
                                                            .setFollowRedirect( true )
                                                            //.setSSLContext( context )
                                                            ;

        asyncHttpClient = new AsyncHttpClient( builder.build() );
    }


    @Override
    public Response doGet( String url, Iterable<HttpRequestHeader> headers, ID entityID ) throws IOException {

        Response response = null;

        if( asyncHttpClient != null && isValidRestUrl( url ) ) {

            String restUrl = url;

            //Object to JSON in String
            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString( entityID );

            //String encoded = toObjectJsonMapper( entityID );

            if( isValidEntityID( entityID ) && jsonInString != null ) {

                //encoded = "/%7B%22OrganizationID%22:%22legat10%22,%22OfficeID%22:%22scot123%22%7D";
                restUrl = url + "/" + jsonInString;
            }

            AsyncHttpClient.BoundRequestBuilder builder = asyncHttpClient.prepareGet( restUrl  );

            response = AsyncHttpHandler( builder, headers );
        }

        return response;

    }

    @Override
    public Response doPost(String url, Iterable<HttpRequestHeader> headers, T entity ) throws IOException {

        Response response = null;


        if( asyncHttpClient != null && isValidRestUrl( url ) && isValidMsccEntity( entity ) ) {


            AsyncHttpClient.BoundRequestBuilder builder = asyncHttpClient.preparePost(url);

            builder.setBody( convertObjectToJsonBytes( entity ) );

//            System.out.println("|||" +  entity );
//            System.out.println("|||" +  url );

            response = AsyncHttpHandler( builder, headers );
        }

        return  response;

    }

    @Override
    public Response doPut(String url, Iterable<HttpRequestHeader> headers, ID entityID, T entity ) throws IOException {

        Response response = null;

        if( asyncHttpClient != null &&  isValidRestUrl( url ) && isValidMsccEntity( entity ) && isValidEntityID( entityID ) ) {

            String restUrl = url;
            //String encoded = toObjectJsonMapper( entityID );
            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString( entityID );

            if( isValidEntityID( entityID ) && jsonInString != null ) {
                restUrl = url + "/" + jsonInString;
            }

            AsyncHttpClient.BoundRequestBuilder builder = asyncHttpClient.preparePut(  restUrl );

            builder.setBody(convertObjectToJsonBytes(entity));

            response =  AsyncHttpHandler(builder, headers);
        }

        return response;

    }

    @Override
    public Response doDelete(String url, Iterable<HttpRequestHeader> headers, ID entityID ) throws IOException {

        Response response = null;

        if( asyncHttpClient != null &&  isValidRestUrl( url ) && isValidEntityID( entityID ) ) {

            String restUrl = url;

            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString( entityID );
            //String encoded = toObjectJsonMapper( entityID );


            if( isValidEntityID( entityID ) && jsonInString != null ) {
                restUrl = url + "/" + jsonInString;
            }


            AsyncHttpClient.BoundRequestBuilder builder = asyncHttpClient.prepareDelete( restUrl );

            response = AsyncHttpHandler(builder, headers);
        }

        return response;

    }


    private Response AsyncHttpHandler( AsyncHttpClient.BoundRequestBuilder builder, Iterable<HttpRequestHeader> headers  )  {

        Response response = null;
        boolean throwed = false;

        if( builder != null ) {

            builder
                    .addHeader("Accept", _CONTENT_TYPE)
                    .addHeader("Content-Type", _APPLICATION_JSON_UTF8)  //application/json;charset=UTF-8
            ;

            if( headers != null ) {
                for (HttpRequestHeader header : headers) {
                    builder.addHeader(header.getKey(), header.getValue());
                }
            }


            Future<Response> responseFuture = builder.execute( new AsyncCompletionHandler() {
                @Override
                public Response onCompleted(Response response) throws Exception {

                    LOGGER.info("Response received:" + response.getResponseBody().toString());
                    return response;
                }

                @Override
                public void onThrowable( Throwable ex ) {
                    //System.out.println(8888 + throwable.getMessage() );
                    LOGGER.error("Unable to fetch: " + " (" + ex.getMessage() + ")");
                    System.out.println("Unable to fetch url: " + " (" + ex.getMessage() + ")");
                }

            });

                try {

                    if (responseFuture != null && !responseFuture.isDone()) {
                        response = responseFuture.get();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    LOGGER.warn("OnException", e.toString());
                } catch (ExecutionException e) {
                    //e.printStackTrace();
                    LOGGER.error("Unable to fetch result: " + " (" + e.getMessage() + ")");
                }


        }

        return response;

    }

    public static byte[] convertObjectToJsonBytes( Object object ) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return mapper.writeValueAsBytes( object );

    }

    public static String createStringWithLength( int length ) {

        StringBuilder builder = new StringBuilder();

        for( int i = 0; i < length; i++ ) {
            builder.append( "a");
        }

        return  builder.toString();
    }

    public boolean isValidMsccEntity( AbstractMsccEntity entity ) {


        if( entity == null )    return  false;

        //isAssignableFrom
        //class.isInstance
        return entity instanceof AbstractMsccEntity;
    }



    public boolean isValidEntityID( AbstractMsccEntityID id ) {

        if( id == null )    return  false;
             //isAssignableFrom
        //class.isInstance
        return id instanceof AbstractMsccEntityID;
    }




    public boolean isValidRestUrl( String url ) {

        if( url == null || url.length() == 0 ) {
            return false;
        }

        if( !isNetworkUrl( url ))   return  false;

        URL u = null;

        try {
            u = new URL( url );
        } catch ( MalformedURLException e ) {
            return false;
        }

        try {
            u.toURI();
        } catch (URISyntaxException e) {
            return false;
        }

        return true;

    }


    public boolean isNetworkUrl(String url) {
        if (url == null || url.length() == 0) {
            return false;
        }
        return isHttpUrl( url) || isHttpsUrl( url );
    }


    public boolean isHttpUrl(String url) {
        return (null != url) &&
                (url.length() > 6) &&
                url.substring(0, 7).equalsIgnoreCase("http://");
        }


    public boolean isHttpsUrl( String url ) {
        return (  null != url) &&
                  (url.length() > 7) &&
                   url.substring(0, 8).equalsIgnoreCase("https://");
        }


    public String toObjectJsonMapper( Object object ) {

        String encoded = null;
        try {
            Gson gson = new GsonBuilder()
                    .disableHtmlEscaping()
                    .create();

            encoded = URLEncoder.encode(gson.toJson( object ).toString(), charSet);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return  encoded;
    }


}
