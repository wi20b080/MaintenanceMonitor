package at.team;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/api/maintenanceMode")
public class MaintenanceMonitor {

    public static String message = "-";

    @Path("/front")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getIndex() throws IOException {
        java.nio.file.Path path =  java.nio.file.Paths.get("C:\\Users\\43670\\Desktop\\SLM\\MaintenanceMonitor\\front\\index.html");
        return java.nio.file.Files.readString(path);
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getStatus(){
        System.out.println(message);
        Response.ResponseBuilder head = Response.ok(message);
        return head.header("Access-Control-Allow-Origin", "*").build();
    }

    public void status(Response a){
        String.valueOf(a.getStatus());
    }

    @POST
    @Path("/{test}")
    public String createInput(@PathParam("test") String input){
        System.out.println(input);
        message = input;
        return input;
    }
    @GET
    @Path("/{test}")
    public String outputInput(@PathParam("test") String input){
        System.out.println(input);
        message = input;
        return input;
    }
}







