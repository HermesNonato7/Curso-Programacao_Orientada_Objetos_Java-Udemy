package com.company;

public class Main {

    public static void main(String[] args) {

        //Cria um animal da floresta
        Animal animal = new Animal();
        animal.setTerreno("Floresta");
        System.out.println("Animal de:" + animal.getTerreno());

        //Cria um cachorro que herda métodos e atributos de Animal
        Cachorro cachorro = new Cachorro();
        cachorro.setRaca("Shitzu");
        cachorro.setTerreno("Casinha");
        System.out.println("Raça:" + cachorro.getRaca());
        System.out.println("Terreno:" + cachorro.getTerreno());
    }
}
