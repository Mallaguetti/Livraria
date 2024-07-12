package com.example.livraria.domain;


import com.example.livraria.controller.dto.LivroRequestDTO;
import java.util.Set;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "clientes")
@Entity(name= "clientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Cliente;
    private String nome;
    @OneToMany(mappedBy = "cliente")
    private Set<Emprestimo> emprestimos;
}



