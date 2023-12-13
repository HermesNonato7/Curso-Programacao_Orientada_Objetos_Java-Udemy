package com.company;

public class Main {

    public static void main(String[] args) {

        //Teste de usuário
        Usuario usuario = new Usuario();
	    usuario.setEmail("john@gmail.com");
	    usuario.setNome("John");
        System.out.println("Email:" + usuario.getEmail());
        System.out.println("Nome:" + usuario.getNome());

        //Teste de personagem
        Personagem personagem = new Personagem();
        personagem.setEmail("johnson@gmail.com");
        personagem.setNome("Johnson");
        personagem.setNivel(1);
        System.out.println("Email:" + personagem.getEmail());
        System.out.println("Nome:" + personagem.getNome());
        System.out.println("Nível:" + personagem.getNivel());
        personagem.aumentaUmNivel();
        System.out.println("Novo Nível:" + personagem.getNivel());

    }
}
