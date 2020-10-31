package br.com.siqueira.javacore.construtores.teste;

import br.com.siqueira.javacore.construtores.classe.Estudante;

public class TesteEstudante {

     public static void main(String[] args){
         Estudante estudante1 = new Estudante("12345", "Gabriel", new double[]{9, 8,10}, "11/04/2016");
         estudante1.imprimi();

     }
}
