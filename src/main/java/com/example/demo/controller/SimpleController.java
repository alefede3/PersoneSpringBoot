package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SimpleController {
    
    @GetMapping(value = "/home")
    public String simpleController() {
        return "home";
    }   
}
