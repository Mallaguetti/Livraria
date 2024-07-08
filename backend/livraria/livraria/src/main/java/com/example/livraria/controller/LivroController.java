package com.example.livraria.controller;

import com.example.livraria.livro.Livro;
import com.example.livraria.livro.LivroRepository;
import com.example.livraria.livro.LivroRequestDTO;
import com.example.livraria.livro.LivroResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("livro")
public class LivroController {

    @Autowired
    private LivroRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveLivro(@RequestBody LivroRequestDTO data){
        Livro livroData = new Livro(data);
        repository.save(livroData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<LivroResponseDTO> getAll(){

        List<LivroResponseDTO> livroList= repository.findAll().stream().map(LivroResponseDTO::new).toList();
        return livroList;
    }
}
