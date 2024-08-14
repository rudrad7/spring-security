package com.rd.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String getHomePage() {
        return "Welcome to the Spring Security :" ;
    }
}
