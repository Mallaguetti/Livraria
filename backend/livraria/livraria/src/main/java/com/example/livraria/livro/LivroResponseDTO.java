package com.example.livraria.livro;

public record LivroResponseDTO(Long id, String title, String image, Integer price) {

    public LivroResponseDTO(Livro livro){
        this(livro.getId(), livro.getTitle(), livro.getImage(), livro.getPrice());
    }
  //Colocar as areas das tabelas
}
