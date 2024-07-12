package com.example.livraria.controller.dto;

import com.example.livraria.domain.Emprestimo;

import java.util.Set;

public record ClienteRequestDTO(Long id, String nome, Set<Emprestimo> emprestimos) {
}
