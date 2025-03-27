package com.example.demo.service;

import com.example.demo.model.Persone;
import com.example.demo.repository.PersoneRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersoneService {

    @Autowired
    private PersoneRepository personeRepository;

    public void savePersona(Persone persona) {
        personeRepository.save(persona);
    }

    public List<Persone> getAllPersone(){
        return personeRepository.findAll();
    }
}