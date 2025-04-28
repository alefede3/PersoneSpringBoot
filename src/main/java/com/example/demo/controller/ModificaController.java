package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Persone;
import com.example.demo.model.PersoneDTO;
import com.example.demo.service.PersoneService;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class ModificaController {

    @Autowired
    private PersoneService personeService;

    @PostMapping("/update/{id}")
    public String updatePersona(@PathVariable Long id, @ModelAttribute PersoneDTO personeDTO, Model model){
        // Persone personaModificata = personeService.getPersona(id);
        Persone personaModificata = new Persone();
        personaModificata.setId(personeDTO.getId());
        personaModificata.setNome(personeDTO.getNome());
        personaModificata.setCognome(personeDTO.getCognome());
        personaModificata.setEta(personeDTO.getEta());
        personeService.savePersona(personaModificata);

        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String editaPersone(@PathVariable Long id, Model model) {
        Persone user  = personeService.getPersona(id);

        model.addAttribute("user", user);

        return "edit";
    }
}
