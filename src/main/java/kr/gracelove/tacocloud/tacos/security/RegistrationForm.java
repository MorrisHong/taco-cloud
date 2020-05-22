package kr.gracelove.tacocloud.tacos.security;

import kr.gracelove.tacocloud.tacos.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by GraceLove on 2020/05/22.
 * Contact : govlmo91@gmail.com
 */

@Data
public class RegistrationForm {

    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
                username, passwordEncoder.encode(password),
                fullname, street, city, state, zip, phone
        );
    }
}
