package com.company;

public class Main {

    public static void main(String[] args) {
	    //FAÇA UM PROGRAMA COM UMA CLASSE POKÉMON QUE
        // RECEBA INFORMAÇÕES DE “NOME E TIPO” DIRETAMENTE NA CONSTRUÇÃO DO OBJETO
        // E ASSOCIE AOS CAMPOS CORRETOS.
        //O NÍVEL DO POKÉMON DEVE INICIAR EM UM VALOR ALEATÓRIO
        //ADICIONE UM MÉTODO PARA IMPRIMIR TODOS OS CAMPOS.
        Pokemon pokemon = new Pokemon("Pikachu", "Elétrico");
        pokemon.imprimeDetalhes();
    }
}
