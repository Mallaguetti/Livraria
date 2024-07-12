package com.example.livraria.controller;

import com.example.livraria.domain.Cliente;
import com.example.livraria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente data){
        return repository.save(data);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Cliente> getAll(){

        List<Cliente> livroList= repository.findAll();
        return repository.findAll();
    }
}
