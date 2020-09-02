package com.antilamer.batchantilamer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("greet")
public class GreetingController {

    @GetMapping
    public String greet() {
        return "Hello there!";
    }
}
