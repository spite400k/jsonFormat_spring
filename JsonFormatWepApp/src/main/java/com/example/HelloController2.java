package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {

    @RequestMapping("/q")
    public String index() {
        return "Hello Spring Boot!";
    }
}