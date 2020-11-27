package br.com.siqueira.javacore.modificadorestatico6.teste;


import br.com.siqueira.javacore.modificadorestatico6.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possíveis: ");
 //       for(int parcela : cliente1.getParcelas()){
 //          System.out.print(parcela + " ");
 //       }

        System.out.println("Tamanho " + Cliente.getParcelas().length);
        System.out.println("Tamanho " + Cliente.getParcelas().length);
        System.out.println("Tamanho " + Cliente.getParcelas().length);
    }
}
