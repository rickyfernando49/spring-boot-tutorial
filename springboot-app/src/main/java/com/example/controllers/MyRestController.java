package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public class MyRestController {
    @RequestMapping("")
    String home() {
        return "Base controller";
    }

    @RequestMapping("/hello")
    String sayHello() {
        return "Hello World!";
    }
}
