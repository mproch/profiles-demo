package pl.mproch.osgi.question;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path(value = "/why")
public interface QuestionService {

    @GET
    @Path("/{userId}")
    String why(@PathParam("userId") Long userId, @QueryParam("question") String question);
}
