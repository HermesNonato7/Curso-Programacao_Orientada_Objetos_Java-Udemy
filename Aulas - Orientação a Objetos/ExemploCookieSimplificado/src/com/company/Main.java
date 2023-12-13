package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Cria um objeto Cookie chamado c
        Cookie c = new Cookie();

        //Altera seus atributos
        c.sabor = "Chocolate";
        c.preco = 2.55;

        //Imprime seus atributos
        System.out.println("O cookie c é de " + c.sabor);
        System.out.println("O cookie c custa R$" + c.preco);

        //Atualizando o sabor do Cookie
        System.out.println("Digite um novo sabor:");
        Scanner leitor = new Scanner(System.in);
        c.sabor = leitor.nextLine();
        System.out.println("Novo sabor:" + c.sabor);

    }
}
