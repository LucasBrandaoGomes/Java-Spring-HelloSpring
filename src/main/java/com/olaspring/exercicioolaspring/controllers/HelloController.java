package com.olaspring.exercicioolaspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping
    public String HelloSpring(){
        return "Olá Spring!";
    }

}

