package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HomeRestController {

    @GetMapping("/resthello")
    public String hello() {
        return "Hello, World! The time is " + LocalDateTime.now();
    }

}
