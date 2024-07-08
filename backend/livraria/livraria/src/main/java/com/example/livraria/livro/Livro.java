package com.example.livraria.livro;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "livros")
@Entity(name= "livros")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Livro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
    //Colocar as verdadeiras areas da tabela!!!!!!

    public Livro(LivroRequestDTO data){
        this.image= data.image();
        this.price= data.price();
        this.title= data.title();
    }
}



