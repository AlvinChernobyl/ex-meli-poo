package com.mercadolivre.exercicio_meli_poo.exercicio;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.setTitulo("Titulo 1");
        livro1.setAutor("Autor");
        livro1.setAnoPublicacao(2021);

        Livro livro2 = new Livro();
        livro2.setTitulo("Teste2");
        livro2.setAutor("teste2");
        livro2.setAnoPublicacao(1);

        Livro livro3 = new Livro();
        livro3.setTitulo("teste");
        livro3.setAutor("teste");
        livro3.setAnoPublicacao(3994);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivro();

    }

}
