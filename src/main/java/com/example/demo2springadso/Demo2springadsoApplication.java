package com.example.demo2springadso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class Demo2springadsoApplication {
    @GetMapping("/mensaje")
    public String mensaje() {
        return "Hola Aprendices ADSO!";
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo2springadsoApplication.class, args);
    }

}
