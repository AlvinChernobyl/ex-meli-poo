package com.mercadolivre.exercicio_meli_poo.exercicio;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano Publicacao: " + anoPublicacao);
    }
}
