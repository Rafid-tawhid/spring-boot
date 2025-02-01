package com.rafid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        System.setProperty("spring.datasource.username", "rafid");
        System.setProperty("spring.datasource.password", "123456");
        SpringApplication.run(Main.class, args);
    }

}
