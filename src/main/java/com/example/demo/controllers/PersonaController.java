package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.demo.model.Persona;
import com.example.demo.model.Usuario;
//import com.example.demo.repositories.PersonaRepository;
import com.example.demo.services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/personas")
@CrossOrigin
public class PersonaController {

    //@Autowired
    //private PersonaRepository repo;
    
    @Autowired
	private PersonaService service;
    
    @PostMapping
    public Persona insertarP(@RequestBody Persona persona){
        return service.insert(persona);
    }
    
    @GetMapping
	public List<Persona> getAll() {
		return service.getAll();
    }
    
    @GetMapping("/consulta")
    public Usuario findByEmailAndPassword(@RequestParam (name = "email") String e_valor, @RequestParam (name = "password") String p_valor){
        return service.findByEmailAndPassword(e_valor, p_valor);
    }
}