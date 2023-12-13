package com.company;

public class Camiseta {
    private String tecido;
    private String tamanho;

    public Camiseta(){}

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void imprimeDetalhes(){
        System.out.println("Camiseta -> Tecido:" + getTecido());
        System.out.println("Camiseta -> Tamanho:" + getTamanho());
    }
}
