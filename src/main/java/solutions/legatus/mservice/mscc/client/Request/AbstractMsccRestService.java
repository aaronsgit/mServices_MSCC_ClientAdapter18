package solutions.legatus.mservice.mscc.client.Request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ning.http.client.Response;
import com.ning.http.client.multipart.StringPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntity;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntityID;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBean;
import solutions.legatus.mservice.mscc.client.Bean.impl.MsccBeanAdapter;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpRequestHeader;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpResponseBean;
import solutions.legatus.mservice.mscc.client.Request.impl.MsccBeanMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahou on 2/18/2016.
 */
public abstract class AbstractMsccRestService<T extends AbstractMsccEntity, EID extends AbstractMsccEntityID> implements IMsccRestService<T, EID>{


    private static final Logger LOGGER = LoggerFactory.getLogger( AbstractMsccRestService.class);
    private final static String _CONTENT_TYPE = "application/json";

    private MsccBeanMapper<T> mapper = new MsccBeanMapper<T>();



    @Override
    public HttpResponseBean<T> addService( IMsccRestClient restClient, AbstractMsccEntity entity, String url  ) {

            LOGGER.info( "addService ... " + AbstractMsccRestService.class + "--->" + entity );

            HttpResponseBean responseBean = null;

            responseBean = new HttpResponseBean<T>();

            List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

            headers.add( new HttpRequestHeader( "Accept", _CONTENT_TYPE ) );

            Response response = null;

            try {
                response = restClient.doPost( url, headers, entity );

                responseBean = ResponseHandler( response, null, entity );

            } catch (IOException e) {
                //e.printStackTrace();
                //LOGGER.warn("OnException", e.toString());
                responseBean.setStatusCode( 500 );
            }

            return responseBean;
    }


    @Override
    public HttpResponseBean<T> findByIdServcice(IMsccRestClient restClient, T entity, EID Id, String url) {

            LOGGER.info("findByIdService ... " + AbstractMsccRestService.class + "--->" + Id);

            HttpResponseBean responseBean = null;

            responseBean = new HttpResponseBean<T>();

            List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

            headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

            Response response = null;

            try {
                response = restClient.doGet( url, headers, Id);
                responseBean = ResponseHandler( response, null, entity );
            } catch (IOException e) {
                e.printStackTrace();
                LOGGER.warn("OnException", e.toString());
                responseBean.setStatusCode( 500 );
            }

            return responseBean;

    } //end of findbyId



    @Override
    public HttpResponseBean<T> deleteByIdService( IMsccRestClient restClient, EID entityID, AbstractMsccEntity entityObject, String url   ) {

                LOGGER.info("deletebyid ... " + AbstractMsccRestService.class + " --->" + entityID);

                HttpResponseBean responseBean = new HttpResponseBean<T>();

                List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

                headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

                Response response = null;
                try {
                    response = restClient.doDelete( url, headers, entityID );

                    responseBean = ResponseHandler( response, null, entityObject );
                } catch (IOException e) {
                    e.printStackTrace();
                    LOGGER.warn("OnException", e.toString());
                    responseBean.setStatusCode( 500 );
                }

                return responseBean;

        } //end of deletebyId




    @Override
    public HttpResponseBean<T> updateService( IMsccRestClient restClient, EID entityID, T entity, String url) {

                LOGGER.info("update ... " + AbstractMsccRestService.class + " --->" + entity);

                HttpResponseBean responseBean = new HttpResponseBean<T>();

                List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

                headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

                Response response = null;
                try {
                    response = restClient.doPut( url, headers, entityID, entity);
                    responseBean = ResponseHandler( response, null, entity );
                } catch (IOException e) {
                    e.printStackTrace();
                    LOGGER.warn("OnException", e.toString());
                    responseBean.setStatusCode( 500 );
                }


                return responseBean;

        } //end of put


    @Override
    public HttpResponseBean<List<T>> listService(  IMsccRestClient restClient, T entityObject, String url ) {

                LOGGER.info("list ... " + AbstractMsccRestService.class + " --->"  );

                HttpResponseBean responseBean = new HttpResponseBean<List<T>>();

                List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

                headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

                Response response = null;

                List<T> t = new ArrayList<T>();


                try {
                    response = restClient.doGet( url, headers, null );
                    responseBean = ResponseHandler( response, t, entityObject );
                } catch (IOException e) {
                    e.printStackTrace();
                    LOGGER.warn("OnException", e.toString());
                    responseBean.setStatusCode( 500 );
                }

            return responseBean;

    } //end of list


    @Override
    public HttpResponseBean<List<T>> listAllService( IMsccRestClient restClient, T entityObject, String url ) {

            LOGGER.info("listAll ... " + AbstractMsccRestService.class + "--->"  );

            int statusCode = -1;
            HttpResponseBean responseBean = new HttpResponseBean<List<T>>();

            List<HttpRequestHeader> headers = new ArrayList<HttpRequestHeader>();

            headers.add(new HttpRequestHeader("Accept", _CONTENT_TYPE));

            List<T> t= new ArrayList<T>();

            Response response = null;

            try {
                response = restClient.doGet( url, headers, null );
                responseBean = ResponseHandler( response, t, entityObject );
            } catch (IOException e) {
                e.printStackTrace();
                LOGGER.warn("OnException", e.toString());
                responseBean.setStatusCode( 500 );
            }


            return responseBean;

    } //end of listAll()

    protected HttpResponseBean ResponseHandler( Response response, List<T> entity,  AbstractMsccEntity entityObject ) throws IOException {
        //protected HttpResponseBean ResponseHandler( Response response, List<T> entity,  T entityObject ) throws IOException {

        HttpResponseBean responseBean = new HttpResponseBean();

        if( response != null ) {

            int statusCode = response.getStatusCode();

            if (statusCode == 200 || statusCode == 201 || statusCode == 202 ) {

                String result = response.getResponseBody().toString();

                if( MsccBeanMapper.isJSONValidArray( result ) && entity != null ) {
                    responseBean = new HttpResponseBean<List<T>>();
                    entity = mapper.toMsccBeanListFromResult( result, entity, entityObject);

                    responseBean.setEntity( entity );
                }

                if( MsccBeanMapper.isJSONValidObject( result ) && entityObject != null ) {
                    responseBean = new HttpResponseBean<T>();

//                    System.out.println( "Result is: " + result );

                    entityObject = (T) mapper.toMsccBeanFromResult(result, entityObject);

                    //ObjectMapper jMapper = new ObjectMapper();
                    //jMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    //TypeReference<T> type = new TypeReference<T>(){};

//                    try {
//                        Class<T> klazz = (Class<T>) Class.forName( entityObject.getClass().getCanonicalName() );
//                        entityObject = jMapper.readValue( result, klazz );
//                    } catch (ClassNotFoundException e) {
//                        e.printStackTrace();
//                    }

                    //List<MyClass> myObjects = mapper.readValue(jsonInput, new TypeReference<List<MyClass>>(){});
                    //TypeReference<E>
                    //List<MsccBeanAdapter.CollectionObject.ID> ids  = mapper.readValue( result, new TypeReference<List<MsccBeanAdapter.CollectionObject.ID>>(){} );


                    responseBean.setEntity( entityObject );
                }

            } else {
                responseBean = new HttpResponseBean<String>();

                //System.out.println(  response.getResponseBody().toString() );

                responseBean.setEntity( response.getResponseBody().toString() );

            }

            responseBean.setStatusCode(response.getStatusCode());

        }

        return responseBean;

    }







}

