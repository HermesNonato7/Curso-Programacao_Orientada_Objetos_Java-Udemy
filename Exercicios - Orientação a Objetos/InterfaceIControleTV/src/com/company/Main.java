package com.company;

public class Main {

    public static void main(String[] args) {
	    //FAÇA UM PROGRAMA COM UMA INTERFACE ICONTROLETV COM UM MÉTODO VIRTUAL VAZIO IMPRIMIRFUNCOES,
        // E CRIE DUAS CLASSES DE SUA ESCOLHA QUE IMPRIMAM DIFERENTES FUNÇÕES PARA CADA TIPO DE TV.

        SmarTV smarTV = new SmarTV();
        smarTV.imprimirFuncoes();

        TuboTV tuboTV = new TuboTV();
        tuboTV.imprimirFuncoes();
    }
}
