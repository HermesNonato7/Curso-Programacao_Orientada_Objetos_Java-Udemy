package com.company;

public class Personagem extends Usuario{

    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void aumentaUmNivel(){
        this.nivel = this.nivel + 1;
    }
}
