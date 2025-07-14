package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.CredenzialiService;

@Controller
public class LoginController {

    @Autowired
    private CredenzialiService credenzialiService;

    @GetMapping("/")
    public String inserisciCredenziali(){

        return "login";
    }

    @PostMapping("/")
    public String verificaUtente(@RequestParam String username, @RequestParam String password, Model model) {
        if(credenzialiService.credenzialiGiuste(username, password)){
            return "redirect:/list";
        }
        else{
            model.addAttribute("error", "Username o password errati");
            return "login";
        }
    }

    
}
