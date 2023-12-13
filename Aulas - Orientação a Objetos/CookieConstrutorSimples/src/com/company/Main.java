package com.company;

public class Main {

    public static void main(String[] args) {
        //Cria um objeto Cookie chamado c
        Cookie c = new Cookie();

        //Altera seus atributos
        c.preco = 2.50;

        //Imprime seus atributos
        System.out.println("O cookie c é de " + c.sabor);
        System.out.println("O cookie c custa R$" + c.preco);
    }
}
