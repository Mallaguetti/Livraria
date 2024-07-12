package com.example.livraria.controller.dto;

import com.example.livraria.domain.Obra;

public record LivroRequestDTO(Long id, String numSerie, Obra obra) {
}
