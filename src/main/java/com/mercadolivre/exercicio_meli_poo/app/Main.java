package com.mercadolivre.exercicio_meli_poo.app;

import com.mercadolivre.exercicio_meli_poo.biblioteca.Livro;
import com.mercadolivre.exercicio_meli_poo.biblioteca.Revista;
import com.mercadolivre.exercicio_meli_poo.biblioteca.Item;
import com.mercadolivre.exercicio_meli_poo.service.Biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.setTitulo("Harry Potter e a Pedra Filosofal");
        livro1.setAutor("J.K. Rowling");
        livro1.setAnoPublicacao(1997);

        Livro livro2 = new Livro();
        livro2.setTitulo("Os Contos de Fadas dos Irmãos Grimm");
        livro2.setAutor("Jacob e Wilhelm Grimm");
        livro2.setAnoPublicacao(1812);

        Livro livro3 = new Livro();
        livro3.setTitulo("A Cinco Passos de Você");
        livro3.setAutor("Rachael Lippincott");
        livro3.setAnoPublicacao(2018);

        Revista revista1 = new Revista();
        revista1.setTitulo("Tecnologia Hoje");
        revista1.setAutor("Equipe TechNow");
        revista1.setAnoPublicacao(2023);
        revista1.setEdicao(58);

        Revista revista2 = new Revista();
        revista2.setTitulo("Ciência em Foco");
        revista2.setAutor("Instituto Nacional de Pesquisas Científicas");
        revista2.setAnoPublicacao(2022);
        revista2.setEdicao(102);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(livro3);
        biblioteca.adicionarItem(revista1);
        biblioteca.adicionarItem(revista2);

        System.out.println("Lista de Livros e Revistas Disponiveis: ");
        System.out.println();
        biblioteca.listarItens();

        String tituloBusca = "Harry Potter e a Pedra Filosofal";
        Item resultado = biblioteca.buscarLivroPorTitulo(tituloBusca);
        if (resultado != null) {
            System.out.println("Resultado da busca por titulo: " + resultado.getTitulo());
            resultado.exibirDetalhes();
        } else  {
            System.out.println("Náo encontrado " + tituloBusca);
        }
    }
}
