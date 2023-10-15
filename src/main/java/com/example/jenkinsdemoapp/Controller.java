package com.example.jenkinsdemoapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "Jenkins Demo App - Hello World!";
    }
}
