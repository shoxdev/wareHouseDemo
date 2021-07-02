package uz.pdp.werehousetask.payLoad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private UUID id;
    private String firstName;
    private String lastName;
    @NotNull(message = "Phone number must not be empty")
    private String phoneNumber;
    private String code;
    @NotNull(message = "Password must not be empty")
    private String password;
    private boolean active;
    @Email(message = "Invalid email")
    @NotNull(message = "Email must not be empty")
    private String email;

}