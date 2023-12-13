package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // -FAÇA UM PROGRAMA COM UMA CLASSE ARMA COM TAMANHO, GETTERS E SETTERS
        // -UMA CLASSE ESPADA FILHA DE ARMA COM LÂMINA, GETTERS E SETTERS.
        // -DEPOIS CRIE UMA ESPADA COM UM TAMANHO E UM MATERIAL
        // INSERIDOS PELO USUÁRIO E IMPRIMA ESSES VALORES NA TELA.

        Scanner leitor = new Scanner(System.in);
        Espada espada = new Espada();

        System.out.println("Digite um tamanho para a espada:");
        espada.setTamanho(leitor.nextLine());
        System.out.println("Digite um material para a lâmina da espada:");
        espada.setLamina(leitor.nextLine());

        System.out.println("Espada-> Tamanho:" + espada.getTamanho());
        System.out.println("Espada-> Lâmina:" + espada.getLamina());
    }
}
