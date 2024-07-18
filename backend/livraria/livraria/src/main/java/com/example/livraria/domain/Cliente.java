package com.example.livraria.domain;


import com.example.livraria.controller.dto.LivroRequestDTO;
import java.util.Set;
import jakarta.persistence.*;
import lombok.*;

@Table(name= "clientes")
@Entity(name= "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Cliente;
    private String nome;
    @OneToMany(mappedBy = "cliente")
    private Set<Emprestimo> emprestimos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}



