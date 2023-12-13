package com.company;

public class Main {

    public static void main(String[] args) {
        //Criando um cookie já com atributos
        Cookie novoCookie = new Cookie("Uva", 4.55);

        //Imprime seus atributos
        System.out.println("O cookie c é de " +novoCookie.sabor);
        System.out.println("O cookie c custa R$" +novoCookie.preco);
    }
}
