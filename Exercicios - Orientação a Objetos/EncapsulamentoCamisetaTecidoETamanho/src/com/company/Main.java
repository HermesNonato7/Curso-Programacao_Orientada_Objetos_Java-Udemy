package com.company;

public class Main {

    public static void main(String[] args) {
        //-FAÇA UM PROGRAMA COM UMA CLASSE CAMISETA COM OS ATRIBUTOS TECIDO E TAMANHO.
        //-USE ENCAPSULAMENTO NOS CAMPOS COM SEUS RESPECTIVOS GETTERS E SETTERS.
        //-CRIE DUAS CAMISETAS VAZIAS,
        //-MUDE AS PROPRIEDADES COM SETTERS E
        //-EXIBA OS DADOS DELAS COM OS GETTERS.

        Camiseta camiseta1 = new Camiseta();
        camiseta1.setTecido("Algodão");
        camiseta1.setTamanho("M");

        Camiseta camiseta2 = new Camiseta();
        camiseta2.setTecido("Lã");
        camiseta2.setTamanho("G");

        camiseta1.imprimeDetalhes();
        System.out.println("Camiseta 2-> Tecido:" + camiseta2.getTecido());
        System.out.println("Camiseta 2-> Tamanho:" + camiseta2.getTamanho());

    }
}
