package com.mercadolivre.exercicio_meli_poo.biblioteca;

import com.mercadolivre.exercicio_meli_poo.ItemBiblioteca;

public abstract class Item implements ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao >= 0) {
            this.anoPublicacao = anoPublicacao;
        }  else {
            System.out.println("O anoPublicacao deve ser 1 e 9999");
        }
    }

    public abstract String getTipo();
}
