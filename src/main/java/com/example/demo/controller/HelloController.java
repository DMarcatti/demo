package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Endpoint simples que retorna uma mensagem
    @GetMapping("/hello")
    public String sayHello() {
        return "Olá, Spring Boot! " ;
    }
}
