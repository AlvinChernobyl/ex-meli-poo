package com.mercadolivre.exercicio_meli_poo.exercicio;

public class ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor(String autor) {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao(int anoPublicacao) {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao >= 0) {
            this.anoPublicacao = anoPublicacao;
        }  else {
            System.out.println("O anoPublicacao deve ser 1 e 9999");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano Publicacao: " + anoPublicacao);
    }
}
