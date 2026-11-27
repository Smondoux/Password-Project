package password.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PasswordApp {
    public static void main(String[] args) {
        SpringApplication.run(PasswordApp.class, args);
    }

    @GetMapping(value = "/password")
    public String generatePassword() {
        return new PasswordGen().generatePassword();
    }
}