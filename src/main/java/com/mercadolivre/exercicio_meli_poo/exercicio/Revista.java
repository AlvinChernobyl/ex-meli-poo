package com.mercadolivre.exercicio_meli_poo.exercicio;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

     @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Edicao: " + edicao);
    }
}
