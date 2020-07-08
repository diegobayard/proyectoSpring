package com.example.demo.repositories;

import java.util.Optional;

import com.example.demo.model.ERol;
import com.example.demo.model.Rol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
	Optional<Rol> findByName(ERol name);
    
}