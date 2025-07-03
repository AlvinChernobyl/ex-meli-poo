package com.mercadolivre.exercicio_meli_poo.exercicio;

public class Livro extends Item {
    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
    }

    @Override
    public String getTipo() {
        return "Livro";
    }
}
