package datax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class WebSaverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
}
