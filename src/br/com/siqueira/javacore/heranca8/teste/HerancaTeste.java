package br.com.siqueira.javacore.heranca8.teste;

import br.com.siqueira.javacore.heranca8.classes.Endereco;
import br.com.siqueira.javacore.heranca8.classes.Funcionario;
import br.com.siqueira.javacore.heranca8.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args){

        Pessoa p = new Pessoa();
        p.setNome("Gina");
        p.setCpf("123.456.789.10");

        Endereco endereco = new Endereco();
        endereco.setBairro("Bairro 1");
        endereco.setRua("Rua 25");

        p.setEndereco(endereco);
        p.imprimi();

        Funcionario f = new Funcionario("Gabriel", "123");

        f.setNome("Augusto");
        f.setCpf("987.765.432-19");
        f.setSalario(15000);
        f.setEndereco(endereco);
        f.imprimi();


    }
}
