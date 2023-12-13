package com.company;

public class Quadrado implements IFormaGeometrica {

    private double tamanho;

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override //Palavra que indica sobreposição
    public double getArea() {
        return tamanho * tamanho;
    }
}
