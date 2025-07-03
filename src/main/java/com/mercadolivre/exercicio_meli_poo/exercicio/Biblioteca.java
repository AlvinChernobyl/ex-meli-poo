package com.mercadolivre.exercicio_meli_poo.exercicio;

import com.mercadolivre.exercicio_meli_poo.ItemBiblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Item> itens = new ArrayList<>();


    public void adicionarItem( Item item ) {
        itens.add(item);
    }

    public void listarItens() {
        for (Item item : itens) {
            item.exibirDetalhes();
        }
    }

    public Item buscarLivroPorTitulo(String titulo) {
        for (Item item : itens) {
            if (item instanceof Livro && item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }

}
