package com.example.demo.repositories;

import java.util.Optional;

import com.example.demo.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    Optional <Persona> findByEmailAndPassword(String email, String password);

	Optional <Persona> findByEmail(String email);

    Optional <Persona> findByUsername(String username);
    
    Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}