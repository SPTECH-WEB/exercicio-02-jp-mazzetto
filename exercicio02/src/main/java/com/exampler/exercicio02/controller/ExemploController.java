package com.exampler.exercicio02.controller;

import com.exampler.exercicio02.model.Exemplo;
import com.exampler.exercicio02.service.ExemploService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exemplos")
public class ExemploController {

    private final ExemploService exemploService;

    public ExemploController(ExemploService exemploService) {
        this.exemploService = exemploService;
    }

    @GetMapping
    public List<Exemplo> listarExemplos() {
        return exemploService.listarTodos();
    }

    @PostMapping
    public void adicionarExemplo(@RequestBody Exemplo exemplo) {
        exemploService.adicionarExemplo(exemplo);
    }
}
