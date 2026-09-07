package com.tai.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/home")
public class helloController {

    @GetMapping("/hello")
    public String hello() {
        return "Test ping";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return String.format("Hello %s", name);
    }
}