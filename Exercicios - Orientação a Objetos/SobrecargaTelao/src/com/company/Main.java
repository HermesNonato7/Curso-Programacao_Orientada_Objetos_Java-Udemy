package com.company;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA COM UMA CLASSE TELAO COM DOIS MÉTODOS DE EXIBIR.
        // UM RECEBE UM NÚMERO DE UM JOGADOR E UM NOME E IMPRIME
        // O OUTRO RECEBE APENAS O NÚMERO DO JOGADOR E IMPRIME.
        Telao telao = new Telao();
        telao.exibir(20);
        telao.exibir(25, "João");
    }
}
