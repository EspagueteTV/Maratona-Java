package br.com.siqueira.treinamento.oo.teste;

import br.com.siqueira.treinamento.oo.classes.Conta;

public class ContaTeste {
    public static void main(String[] args){
        Conta c1 = new Conta();

        c1.setNome("Hugo");
        c1.setNumeroConta(112);
        c1.setAgencia("45678-9");
        c1.setSaldo(500);
        c1.setDataAbertura("26/10/2020");

        c1.sacar(400);
        c1.deposita(700);
        System.out.println(c1.recuperaDadosImpresao());
    }
}
