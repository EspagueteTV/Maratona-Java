package br.com.siqueira.javacore.blocodeinicializacao5.teste;

import br.com.siqueira.javacore.blocodeinicializacao5.classe.Cliente;

public class ClienteTeste {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possíveis: ");
        for(int parcela : cliente.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
