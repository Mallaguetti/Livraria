package com.example.livraria.controller.dto;

import com.example.livraria.domain.Cliente;
import com.example.livraria.domain.Livro;

import java.time.LocalDate;

public record EmprestimoRequestDTO(Long id, LocalDate dataDevolucao, Cliente cliente, Livro livro) {
}
