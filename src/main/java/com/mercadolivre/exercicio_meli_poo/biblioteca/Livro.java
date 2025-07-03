package com.mercadolivre.exercicio_meli_poo.biblioteca;

public class Livro extends Item {
    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Tipo: " + getTipo());
    }

    @Override
    public String getTipo() {
        return "Livro";
    }
}
