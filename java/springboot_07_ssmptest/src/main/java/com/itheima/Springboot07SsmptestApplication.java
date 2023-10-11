package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.yml")

public class Springboot07SsmptestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07SsmptestApplication.class, args);
    }

}
