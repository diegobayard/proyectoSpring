package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Contacto;

public interface ContactoService {
    Contacto insert(Contacto contacto);

	List<Contacto> getAll();
}