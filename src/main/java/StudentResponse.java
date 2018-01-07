import java.util.Random;

/**
 * Created by krzysztof on 07.01.18.
 */
public class StudentResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    public StudentResponse() {
    }

    public StudentResponse(Student student) {
        this.id = Math.abs(new Random().nextLong());
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.age = student.getAge();
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
