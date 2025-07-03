package com.mercadolivre.exercicio_meli_poo.exercicio;

import com.mercadolivre.exercicio_meli_poo.ItemBiblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.setTitulo("Livro 1");
        livro1.setAutor("Autor");
        livro1.setAnoPublicacao(2018);

        Livro livro2 = new Livro();
        livro2.setTitulo("Livro 2");
        livro2.setAutor("Autor");
        livro2.setAnoPublicacao(2018);

        Livro livro3 = new Livro();
        livro3.setTitulo("Livro 3");
        livro3.setAutor("Autor");
        livro3.setAnoPublicacao(2018);

        Revista revista1 = new Revista();
        revista1.setTitulo("Revista 1");
        revista1.setAutor("Autor");
        revista1.setAnoPublicacao(2018);
        revista1.setEdicao(201);

        Revista revista2 = new Revista();
        revista2.setTitulo("Revista 2");
        revista2.setAutor("Autor");
        revista2.setAnoPublicacao(2018);
        revista2.setEdicao(201);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(livro3);
        biblioteca.adicionarItem(revista1);
        biblioteca.adicionarItem(revista2);

        System.out.println("Lista disponiveis");
        biblioteca.listarItens();

        String tituloBusca = "Livro 11";
        Item resultado = (Item) biblioteca.buscarLivroPorTitulo(tituloBusca);
        if (resultado != null) {
            System.out.println("Resultado da busca por titulo: " + resultado.getTitulo());
            resultado.exibirDetalhes();
        } else  {
            System.out.println("Náo encontrado " + tituloBusca);
        }

    }

}
