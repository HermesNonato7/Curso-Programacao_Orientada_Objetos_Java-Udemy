package com.company;

public class Main {

    public static void main(String[] args) {
        //Cria um telefone
        Telefone telefone = new Telefone();

        //Não consigo mais modificar diretamente
        //Porque o modificador de acesso PRIVATE
        //faz o modelo não ser acessível!
        //telefone.modelo = "Motorola";

        //Modifica o modelo do telefone (SETTER)
        telefone.setModelo("Iphone");

        //Imprime pegando o modelo do telefone (GETTER)
        System.out.println("Modelo:" + telefone.getModelo());

    }
}
