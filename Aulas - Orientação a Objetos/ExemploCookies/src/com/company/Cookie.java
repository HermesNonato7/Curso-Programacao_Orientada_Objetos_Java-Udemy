package com.company;

public class Cookie {
    public String sabor;
    public double preco;

    //static ou não
    //tipo de retorno
    //
    public Cookie(){
        System.out.println("Um cookie foi criado");
        sabor = "Básico";
    }

    public Cookie(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
    }
}
