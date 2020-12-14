package br.com.siqueira.treinamento.expressoGP.teste;

import br.com.siqueira.treinamento.expressoGP.classe.Cliente;
import br.com.siqueira.treinamento.expressoGP.classe.Usuario;

public class TesteUsuario {
    public static void main(String[] args){
        int op = Usuario.mostrarMenu();

        System.out.println(op);

        Cliente cliente1 = new Cliente("João", "9 9675-7634");

        cliente1.AlterarCliente();
    }
}
