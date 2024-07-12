package com.example.livraria.repository;

import com.example.livraria.domain.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObraRepository extends JpaRepository<Obra,Long> {
}