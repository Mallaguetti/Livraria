package com.example.livraria.livros;

import jakarta.persistence.*;

import java.awt.*;

@Table(name= "livros")
@Entity(name= "livros")

public class Livro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String imagem;
    private String autor;
    private Integer preco;

}
