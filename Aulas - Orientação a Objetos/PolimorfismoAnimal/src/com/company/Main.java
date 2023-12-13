package com.company;

public class Main {

    public static void main(String[] args) {
        // Animal emite som SEM SOM
        Animal animal = new Animal();
        animal.emitirSom();

        // Cachorro vai latir
        Cachorro cachorro =  new Cachorro();
        cachorro.emitirSom();

        // Gato vai miar
        Gato gato = new Gato();
        gato.emitirSom();
    }
}
