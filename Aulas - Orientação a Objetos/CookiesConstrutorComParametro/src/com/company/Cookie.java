package com.company;

public class Cookie {
    public String sabor;
    public double preco;

    public Cookie(){
        System.out.println("Um cookie foi criado");
        sabor = "Básico";
    }

    public Cookie(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
    }

}
