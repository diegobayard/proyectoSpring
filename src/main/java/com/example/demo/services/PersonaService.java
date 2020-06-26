package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Persona;

public interface PersonaService {
    List<Persona> getAll();
    Optional<Persona> findById(Long id);
    Persona insert(Persona persona);
	Optional<Persona> findByEmailAndPassword(String email, String password);

}