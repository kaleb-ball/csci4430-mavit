package uno.csci4830.mavitapi.payload.request.authentication;

import lombok.Getter;
import lombok.Setter;
import uno.csci4830.mavitapi.model.College;
import uno.csci4830.mavitapi.model.Major;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
public class SignupRequest {
    @NotBlank
    @Size(min=6, max=20)
    private String username;

    @NotBlank
    @Size(max=50)
    private String email;

    @NotBlank
    @Size(min=6, max=20)
    private String password;

    @NotBlank
    @Size(min=8, max=8)
    private String studentId;

    @NotBlank
    @Size(max=50)
    private String firstname;

    @NotBlank
    @Size(max=50)
    private String lastname;

    private Set<String> role;

    private Set<Major> majors;

    private Set<College> colleges;

}
