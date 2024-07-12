package com.example.livraria.controller;

import com.example.livraria.domain.Livro;
import com.example.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Livro saveLivro(@RequestBody Livro data){
        return repository.save(data);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Livro> getAll(){

        List<Livro> livroList= repository.findAll();
        return repository.findAll();
    }
}
