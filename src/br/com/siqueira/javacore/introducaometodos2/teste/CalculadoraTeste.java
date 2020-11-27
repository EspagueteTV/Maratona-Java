package br.com.siqueira.javacore.introducaometodos2.teste;


import br.com.siqueira.javacore.introducaometodos2.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros();
        Calculadora.multiplicaDoisNumeros(5, 5);

        Calculadora.imprimirDoisNumerosDivididos(20, 5);
        System.out.println("Continuar.........");

        int [] numeros = new int[]{1};

        Calculadora.somaArray(numeros);
        Calculadora.somaVarArgs(1, 2, 3, 4, 5);


    }
}
