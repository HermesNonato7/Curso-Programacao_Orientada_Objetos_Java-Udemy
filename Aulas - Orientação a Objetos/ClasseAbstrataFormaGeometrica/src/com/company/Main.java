package com.company;

public class Main {

    public static void main(String[] args) {

        //Cria um quadrado de tamanho 5 e exibe a área
        Quadrado quadrado = new Quadrado();
        quadrado.setTamanho(5);
        System.out.println("Area:" + quadrado.getArea());

    }
}
