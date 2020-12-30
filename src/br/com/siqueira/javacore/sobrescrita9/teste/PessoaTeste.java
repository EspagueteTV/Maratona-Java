package br.com.siqueira.javacore.sobrescrita9.teste;

import br.com.siqueira.javacore.sobrescrita9.classe.Pessoa;

public class PessoaTeste{
    public static void main(String args[]){
        Pessoa p = new Pessoa();
        p.setNome("Joaquina");
        p.setIdade(30);
        System.out.println(p);

    }
}
