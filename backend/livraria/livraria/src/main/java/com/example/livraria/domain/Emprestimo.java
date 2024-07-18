package com.example.livraria.domain;


import com.example.livraria.controller.dto.LivroRequestDTO;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Table(name= "emprestimos")
@Entity(name= "emprestimos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Emprestimo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Emprestimo;
    private LocalDate dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "id_Cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_Livro")
    private Livro livro;


    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    // Getters explícitos
    public Long getId_Emprestimo() {
        return id_Emprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }
}



