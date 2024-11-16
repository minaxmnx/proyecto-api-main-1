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

@Path("/hello") 
    public class GreetingResource {

    @GET  
    @Produces(MediaType.TEXT_PLAIN)  
    public String hello() {
        return "Hello from RESTEasy Reactive"; 
    }
}