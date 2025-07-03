package com.mercadolivre.exercicio_meli_poo.biblioteca;

public class Revista extends Item {
    private int edicao;

    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Tipo: " + getTipo());
    }

    @Override
    public String getTipo() {
        return "Resvista";
    }
}
