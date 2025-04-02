package com.exampler.exercicio02.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exemplo {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("nome")
    private String nome;
}
