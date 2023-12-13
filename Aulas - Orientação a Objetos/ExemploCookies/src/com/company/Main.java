package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Cria um objeto Cookie chamado c
        Cookie c = new Cookie();

        //Altera seus atributos
        c.sabor = "Chocolate";
        c.preco = 2.50;

        //Imprime seus atributos
        System.out.println("O cookie c é de " +c.sabor);
        System.out.println("O cookie c custa R$" +c.preco);

        //Atualiza o sabor
        System.out.println("Digite o novo sabor");
        Scanner leitor = new Scanner(System.in);
        c.sabor = leitor.nextLine();
        System.out.println("Novo sabor:" +c.sabor);

        //Criando um cookie já com atributos
        Cookie novoCookie = new Cookie("Uva", 4.5);

        //Imprime seus atributos
        System.out.println("O cookie c é de " +novoCookie.sabor);
        System.out.println("O cookie c custa R$" +novoCookie.preco);
    }
}
