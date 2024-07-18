package com.example.livraria.controller;

import com.example.livraria.domain.Livro;
import com.example.livraria.controller.dto.LivroRequestDTO;
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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public Livro getById(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public Livro updateLivro(@PathVariable Long id, @RequestBody LivroRequestDTO data){
        Livro livro = repository.findById(id).orElseThrow();
        livro.setNumSerie(data.numSerie()); // access the numSerie field
        livro.setObra(data.obra()); // access the obra field
        return repository.save(livro);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable Long id){
        repository.deleteById(id);
    }


}
