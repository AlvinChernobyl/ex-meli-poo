package com.mercadolivre.exercicio_meli_poo.exercicio;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<Livro>();
    Livro livro = new Livro();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivro() {
        for (Livro livro : livros) {
            livro.exibirDetalhes();
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

}
