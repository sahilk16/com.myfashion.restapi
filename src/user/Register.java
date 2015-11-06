package user;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by rohanmathure on 11/6/15.
 */


@Path("/user/signUp")
public class Register {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String GetTestString()
    {
        return "This is a test string";
    }
}
