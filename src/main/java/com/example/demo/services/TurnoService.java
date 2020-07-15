package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Turno;

public interface TurnoService {

	Turno insert(Turno turno);

	List<Turno> getAll();
    
}