package com.example.demo.controller;

import com.example.demo.model.Persone;
import com.example.demo.service.PersoneService;

import org.springframework.ui.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class PersoneController {

    @Autowired
    private PersoneService personeService;

    @PostMapping("/save")
    public String savePersona(@RequestParam String nome, 
                              @RequestParam String cognome, 
                              @RequestParam int eta) {
    
        Persone nuovaPersona = new Persone();
        nuovaPersona.setNome(nome);
        nuovaPersona.setCognome(cognome);
        nuovaPersona.setEta(eta);

        personeService.savePersona(nuovaPersona); 

        return "redirect:/home"; 
    }

    @GetMapping("/list")
    public String listPersone(Model model) {
        List<Persone> persone = personeService.getAllPersone();

        model.addAttribute("persone", persone);

        return "list";
    }
    
}
