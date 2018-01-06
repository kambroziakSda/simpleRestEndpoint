import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by krzysztof on 06.01.18.
 */
@Path("/students")
@Stateless
public class StudentResource {

    private static final Map<String, Student> STUDENTS = new ConcurrentHashMap<String, Student>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllStudents() {
        return Response.ok(STUDENTS.values()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(Student student) {
        STUDENTS.put(student.getLastName(), student);
        return Response.ok().build();
    }


}
