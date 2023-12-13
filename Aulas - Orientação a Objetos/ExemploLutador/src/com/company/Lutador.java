package com.company;

public class Lutador{

    String nome;

    public Lutador(String nome){
        this.nome = nome;
    }

    public void daSoco(){
        System.out.println(this.nome + " deu um soco!");
    }

}
