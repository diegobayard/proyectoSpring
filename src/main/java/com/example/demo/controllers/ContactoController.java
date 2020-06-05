package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contacto;
import com.example.demo.repositories.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/contactos")
@CrossOrigin
public class ContactoController {

    @Autowired
    private ContactoRepository repo;
    
    @PostMapping
    public void save(@RequestBody Contacto contacto){
        repo.save(contacto);
    }
}