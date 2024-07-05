package com.example.livraria.controller;

import com.example.livraria.livros.Livro;
import com.example.livraria.livros.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Livro")

public class LivroController {
    @Autowired
    private LivroRepository repository;

    @GetMapping
    public List<Livro> getAll(){
        List<Livro> livroList= repository.findAll();
        return livroList;
    }
}
