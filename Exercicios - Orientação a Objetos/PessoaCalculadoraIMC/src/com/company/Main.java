package com.company;

public class Main {

    public static void main(String[] args) {
	    //FAÇA UM PROGRAMA COM UMA CLASSE PESSOA COM
            //NOME, PESO, ALTURA E IMC.
        // O IMC DEVE SER CALCULADO APÓS A CRIAÇÃO DA PESSOA,
        // OS DEMAIS VALORES SÃO CRIADOS NO MÉTODO CONSTRUTOR.
        //IMC: IMC = Peso ÷ (Altura × Altura)

        Pessoa pessoa = new Pessoa("John", 73, 1.77);
        pessoa.imprimePessoa();
    }
}
