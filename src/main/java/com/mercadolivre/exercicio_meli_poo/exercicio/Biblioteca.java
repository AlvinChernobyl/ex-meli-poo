package com.mercadolivre.exercicio_meli_poo.exercicio;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<ItemBiblioteca> item = new ArrayList<ItemBiblioteca>();
    ItemBiblioteca itemBiblioteca = new ItemBiblioteca();

    public void adicionarLivro(ItemBiblioteca itemBiblioteca) {
        item.add(itemBiblioteca);
    }

    public void listarLivro() {
        for (ItemBiblioteca itemBiblioteca : item) {
            itemBiblioteca.exibirDetalhes();
        }
    }

    public ItemBiblioteca buscarLivroPorTitulo(String titulo) {
        for (ItemBiblioteca itemBiblioteca : item) {
            if (itemBiblioteca.getTitulo().equalsIgnoreCase(titulo)) {
                return itemBiblioteca;
            }
        }
        return null;
    }

}
