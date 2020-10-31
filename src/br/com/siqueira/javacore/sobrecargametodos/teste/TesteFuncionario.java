package br.com.siqueira.javacore.sobrecargametodos.teste;

import br.com.siqueira.javacore.sobrecargametodos.classes.Funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Chica da Silva", "111-222-333-44", 4500, "1222-2");
        Funcionario funcionario2 = new Funcionario();

        funcionario.imprimi();
        funcionario2.imprimi();
    }
}
