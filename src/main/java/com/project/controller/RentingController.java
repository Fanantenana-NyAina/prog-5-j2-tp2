package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentingController {
    @GetMapping("/ping")
    public String pingPong(){
        return "pong";
    }
}
