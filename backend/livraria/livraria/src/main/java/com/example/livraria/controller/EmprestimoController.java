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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public Emprestimo updateEmprestimo(@PathVariable Long id, @RequestBody Emprestimo data) {
        Emprestimo emprestimo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Emprestimo não encontrado"));

        emprestimo.setDataDevolucao(data.getDataDevolucao());
        emprestimo.setCliente(data.getCliente());
        emprestimo.setLivro(data.getLivro());
        // Ajuste os demais campos conforme necessário

        return repository.save(emprestimo);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteEmprestimo(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
