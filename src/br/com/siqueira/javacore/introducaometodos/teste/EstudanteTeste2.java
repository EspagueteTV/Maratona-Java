package br.com.siqueira.javacore.introducaometodos.teste;

import br.com.siqueira.javacore.introducaometodos.classes.*;

public class EstudanteTeste2 {
    public static void main(String[] args) {

        EstudanteV2 discente = new EstudanteV2();

        discente.setNome("Gabriel Siqueira");
        discente.setIdade(-1);
        discente.setNotas(new double[]{3, 9, 8});

        discente.print();
        discente.tirarMedia();
        System.out.printf("Aprovado: %b ", discente.isAprovado());
        System.out.println(discente.getNome());
        System.out.println(discente.getIdade());
    }
}
