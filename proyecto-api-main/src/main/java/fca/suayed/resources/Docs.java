package fca.suayed.resources;

import fca.suayed.dal.StoreDal;
import fca.suayed.dto.ProductDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;




import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Path("/docs")
public class Docs {

    
   @GET
    @Produces(MediaType.TEXT_HTML)
    public Response redirectToSwaggerUI() {
    return Response.status(Response.Status.FOUND)
            .location(URI.create("http://localhost:8080/q/swagger-ui"))
            .build();
}

}
