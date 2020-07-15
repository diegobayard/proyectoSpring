package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Turno {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String username;
private String email;
 private String barbero;
 private int dia;
 private int mes;
 private String hora;
}