package com.example.livraria.repository;

import com.example.livraria.domain.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo,Long>{
}
