package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Persona;
import com.example.demo.model.Usuario;

public interface PersonaService {
    List<Persona> getAll();
    Optional<Persona> findById(Long id);
    Persona insert(Persona persona);
	Usuario findByEmailAndPassword(String email, String password);

}