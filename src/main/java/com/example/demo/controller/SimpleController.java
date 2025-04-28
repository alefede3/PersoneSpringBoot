package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class SimpleController {
    
    @GetMapping(value = "/home")
    public String simpleController() {
        return "home";
    }   
}
