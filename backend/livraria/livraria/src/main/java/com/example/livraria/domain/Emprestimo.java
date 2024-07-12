package com.example.livraria.domain;


import com.example.livraria.controller.dto.LivroRequestDTO;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "emprestimos")
@Entity(name= "emprestimos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Emprestimo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Emprestimo;
    private LocalDate dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "id_Cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_Livro")
    private Livro livro;
}



