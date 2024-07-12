package com.example.livraria.controller;

import com.example.livraria.domain.Emprestimo;
import com.example.livraria.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Emprestimo saveEmprestimo(@RequestBody Emprestimo data){
        return repository.save(data);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Emprestimo> getAll(){

        List<Emprestimo> emprestimoList= repository.findAll();
        return repository.findAll();
    }
}
