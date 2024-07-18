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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente data){
        Cliente cliente = repository.findById(id).orElseThrow();
        cliente.setNome(data.getNome());
        // não há outros campos para atualizar além do nome
        return repository.save(cliente);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id){
        repository.deleteById(id);
    }
}
