package solutions.legatus.mservice.mscc.client.Request;

import com.ning.http.client.Response;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntity;
import solutions.legatus.mservice.mscc.client.Bean.AbstractMsccEntityID;
import solutions.legatus.mservice.mscc.client.Request.impl.HttpRequestHeader;

import java.io.IOException;

/**
 * Created by ahou on 2/14/2016.
 */

public interface IMsccRestClient<T extends AbstractMsccEntity, ID extends AbstractMsccEntityID> {

    public Response doGet(    String url, Iterable<HttpRequestHeader> headers, ID entityID ) throws IOException;
    public Response doPost(   String url, Iterable<HttpRequestHeader> headers, T entity )     throws IOException;
    public Response doPut(    String url, Iterable<HttpRequestHeader> headers, ID entityID, T entity ) throws IOException;
    public Response doDelete( String url, Iterable<HttpRequestHeader> headers, ID entityID ) throws IOException;
}
