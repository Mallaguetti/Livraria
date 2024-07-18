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


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public Obra getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Obra não encontrada"));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public Obra updateObra(@PathVariable Long id, @RequestBody Obra data) {
        Obra obra = repository.findById(id).orElseThrow(() -> new RuntimeException("Obra não encontrada"));

        obra.setNome(data.getNome());
        obra.setAutor(data.getAutor());

        return repository.save(obra);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteObra(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
