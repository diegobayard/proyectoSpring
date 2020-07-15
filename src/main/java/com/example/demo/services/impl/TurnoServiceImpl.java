package com.example.demo.services.impl;

import java.util.List;

import com.example.demo.model.Turno;
import com.example.demo.repositories.TurnoRepository;
import com.example.demo.services.TurnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoServiceImpl implements TurnoService {

    @Autowired
    private TurnoRepository repo;

    @Override
    public Turno insert(Turno turno) {
        return repo.save(turno);
    }

    @Override
    public List<Turno> getAll() {
        return repo.findAll();
    }
    
}