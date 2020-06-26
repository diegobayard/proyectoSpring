package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Persona;
import com.example.demo.repositories.PersonaRepository;
import com.example.demo.services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository repo;

	@Override
	public List<Persona> getAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Persona> findById(Long id) {
		return repo.findById(id);
	}

	@Override
	public Persona insert(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public Optional <Persona> findByEmailAndPassword(String email, String password) {
		return repo.findByEmailAndPassword(email, password);
	}

}