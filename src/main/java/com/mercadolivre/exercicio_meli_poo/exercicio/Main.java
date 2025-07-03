package com.mercadolivre.exercicio_meli_poo.exercicio;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.titulo = "Arvore";
        livro1.autor = "teste1";
        livro1.anoPublicacao = 2021;

        Livro livro2 = new Livro();
        livro2.titulo = "Teste2";
        livro2.autor = "teste2";
        livro2.anoPublicacao = 2021;

        Livro livro3 = new Livro();
        livro3.titulo = "Teste3";
        livro3.autor = "teste3";
        livro3.anoPublicacao = 2021;

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivro();

    }
}
