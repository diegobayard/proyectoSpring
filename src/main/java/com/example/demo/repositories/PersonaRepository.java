package com.example.demo.repositories;

import com.example.demo.model.Persona;
import com.example.demo.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    Usuario findByEmailAndPassword(String email, String password);

}