package br.com.siqueira.javacore.introducaometodos2.classes;

public class Calculadora {

    public static void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public static void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public static void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não é possível dividir um número por 0");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static void imprimirDoisNumerosDivididos(double num1, double num2) {
        System.out.println(divideDoisNumeros(num1, num2));
    }

    public static void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois números");
        System.out.printf("num1 = %d, num2 = %d \n", num1, num2);
    }

    public static void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }

    public static void somaVarArgs(double valor, int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }
}
