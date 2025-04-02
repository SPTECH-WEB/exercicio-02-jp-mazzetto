package com.exampler.exercicio02.service;


import com.exampler.exercicio02.model.Exemplo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExemploService {
    private final List<Exemplo> exemplos = new ArrayList<>();

    public List<Exemplo> listarTodos() {
        return exemplos;
    }

    public void adicionarExemplo(Exemplo exemplo) {
        exemplos.add(exemplo);
    }
}
