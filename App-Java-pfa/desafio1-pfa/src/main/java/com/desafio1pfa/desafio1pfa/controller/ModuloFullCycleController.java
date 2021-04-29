package com.desafio1pfa.desafio1pfa.controller;

import com.desafio1pfa.desafio1pfa.repository.ModuloFullCycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/modulos"})
public class ModuloFullCycleController {
    @Autowired
    private ModuloFullCycleRepository repository;

    @GetMapping
    public List findAll() {
        return this.repository.findAll();
    }
}