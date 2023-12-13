package com.company;

import java.util.Random;

public class Pokemon {
    public String nome;
    public String tipo;
    public int nivel;

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = retornaNivelAleatorio(1, 10);
    }

    public int retornaNivelAleatorio(int min, int max){
        //Gerador de aleatórios
        Random aleatorio = new Random();

        //Gera um aleatório de min a max
        return min + aleatorio.nextInt(max - min +1);
    }

    public void imprimeDetalhes(){
        System.out.println("Nome:"+ this.nome);
        System.out.println("Tipo:"+ this.tipo);
        System.out.println("Nível:"+ this.nivel);
    }
}
