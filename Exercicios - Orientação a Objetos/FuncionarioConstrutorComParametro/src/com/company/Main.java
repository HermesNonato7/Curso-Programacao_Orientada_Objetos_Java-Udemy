package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //FAÇA UM PROGRAMA QUE LEIA UM NOME PARA UM FUNCIONÁRIO
        //E CRIA UM OBJETO FUNCIONÁRIO COM ESSE NOME INFORMADO
        //E UM SALÁRIO DE R$1000

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nomeLido = leitor.nextLine();

        Funcionario funcionario = new Funcionario(nomeLido);

        System.out.println("Nome:"+funcionario.nome);
        System.out.println("Salário:"+funcionario.salario);
    }
}
