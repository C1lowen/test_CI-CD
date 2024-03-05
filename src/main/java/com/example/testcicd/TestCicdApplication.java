package com.example.testcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestCicdApplication {

    @GetMapping("/hello")
    public String testHello() {
        return "hello user!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestCicdApplication.class, args);
    }

}
