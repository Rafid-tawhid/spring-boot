package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.amigoscode")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("Hello World!");
    }
    @GetMapping("/greet")
    public  String greet(String name) {
        return "Hello " + name + "!";
    }

}
//
 //
 //
