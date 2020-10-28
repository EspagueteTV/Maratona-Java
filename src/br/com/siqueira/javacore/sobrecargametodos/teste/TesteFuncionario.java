package br.com.siqueira.javacore.sobrecargametodos.teste;

import br.com.siqueira.javacore.sobrecargametodos.classes.Funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.init("Chica da Silva", "111-222-333-44", 4500, "1222-2");
        funcionario.imprimi();

    }
}
