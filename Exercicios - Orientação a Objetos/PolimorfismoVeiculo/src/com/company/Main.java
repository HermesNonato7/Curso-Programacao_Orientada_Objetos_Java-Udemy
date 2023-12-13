package com.company;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA COM UMA CLASSE VEICULO COM UM MÉTODO LOCOMOVER
        // E DUAS CLASSES FILHAS
        // CARRO E MOTO QUE
        // SOBREESCREVAM O MÉTODO LOCOMOVER DO SEU JEITO

        Veiculo veiculo = new Veiculo();
        veiculo.locomover();

        Carro carro = new Carro();
        carro.locomover();

        Moto moto = new Moto();
        moto.locomover();
    }
}
