package com.example.livraria.controller;

import com.example.livraria.domain.Obra;
import com.example.livraria.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/obras")
public class ObraController {

    @Autowired
    private ObraRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Obra saveObra(@RequestBody Obra data){
        return repository.save(data);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Obra> getAll(){

        List<Obra> obraList= repository.findAll();
        return repository.findAll();
    }
}
