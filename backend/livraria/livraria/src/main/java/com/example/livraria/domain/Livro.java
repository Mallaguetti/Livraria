package com.example.livraria.domain;


import com.example.livraria.controller.dto.LivroRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "livros")
@Entity(name= "livros")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Livro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Livro;
    private String numSerie;
    @ManyToOne
    @JoinColumn(name = "obra")//Esta relacionada a tabela Obra
    private Obra obra;

}



