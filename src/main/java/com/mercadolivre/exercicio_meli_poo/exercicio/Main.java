package com.mercadolivre.exercicio_meli_poo.exercicio;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        ItemBiblioteca itemBiblioteca1 = new ItemBiblioteca();
        itemBiblioteca1.setTitulo("Titulo 1");
        itemBiblioteca1.setAutor("Autor");
        itemBiblioteca1.setAnoPublicacao(2021);

        ItemBiblioteca itemBiblioteca2 = new ItemBiblioteca();
        itemBiblioteca2.setTitulo("Teste2");
        itemBiblioteca2.setAutor("teste2");
        itemBiblioteca2.setAnoPublicacao(1);

        ItemBiblioteca itemBiblioteca3 = new ItemBiblioteca();
        itemBiblioteca3.setTitulo("teste");
        itemBiblioteca3.setAutor("teste");
        itemBiblioteca3.setAnoPublicacao(3994);

        biblioteca.adicionarLivro(itemBiblioteca1);
        biblioteca.adicionarLivro(itemBiblioteca2);
        biblioteca.adicionarLivro(itemBiblioteca3);

        biblioteca.listarLivro();

    }

}
