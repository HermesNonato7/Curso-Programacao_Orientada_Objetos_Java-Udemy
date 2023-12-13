package com.company;

public class Cookie {
    public String sabor;
    public double preco;

    //public: pode ser acessado por outras classes
    //nome do método construtor: o mesmo nome da classe
    //parâmetros: opcional
    public Cookie(){
        System.out.println("Um cookie foi criado");
        sabor = "Básico";
    }
}

