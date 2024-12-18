package tn.esprit.courzelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CourzeloApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourzeloApplication.class, args);
    }

}