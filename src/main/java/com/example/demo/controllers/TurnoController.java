package com.example.demo.controllers;

import java.util.List;

import com.example.demo.model.Turno;
import com.example.demo.services.TurnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turnos")
@CrossOrigin
public class TurnoController {
    
    @Autowired
	private TurnoService service;
    
    @PostMapping
    public Turno save(@RequestBody Turno turno){
        return service.insert(turno);
    }

    @GetMapping
	public List<Turno> getAll() {
		return service.getAll();
    }

}