package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/personas")
@CrossOrigin
public class PersonaController {

    @Autowired
    private PersonaRepository repo;
    
    @PostMapping
    public void save(@RequestBody Persona persona){
        repo.save(persona);
    }
}