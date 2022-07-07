package id.ac.unnnur.logbook.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RegisterRequest implements Serializable {

    private String username;
    private String password;
    private String email;
    private String role;
}
