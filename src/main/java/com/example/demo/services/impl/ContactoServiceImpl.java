package com.example.demo.services.impl;

import java.util.List;

import com.example.demo.model.Contacto;
import com.example.demo.repositories.ContactoRepository;
import com.example.demo.services.ContactoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoServiceImpl implements ContactoService {
    @Autowired
    private ContactoRepository repo;

    @Override
    public Contacto insert(Contacto contacto) {
        return repo.save(contacto);
    }

    @Override
    public List<Contacto> getAll() {
        return repo.findAll();
    }    
}