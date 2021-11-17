package com.dh.infra.jenkinsspringdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @GetMapping("/hello")
    public String helloMessage() {
        return "Hello World!";
    }
}
