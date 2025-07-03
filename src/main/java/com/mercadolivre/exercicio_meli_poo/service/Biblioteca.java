package com.mercadolivre.exercicio_meli_poo.service;

import com.mercadolivre.exercicio_meli_poo.biblioteca.Livro;
import com.mercadolivre.exercicio_meli_poo.biblioteca.Item;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Item> itens = new ArrayList<>();


    public void adicionarItem( Item item ) {
        itens.add(item);
    }

    public void listarItens() {
        for (Item item : itens) {
            item.exibirDetalhes();
            System.out.println("\n----------------");
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
