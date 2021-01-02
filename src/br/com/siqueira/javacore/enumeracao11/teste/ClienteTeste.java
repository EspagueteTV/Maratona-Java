package br.com.siqueira.javacore.enumeracao11.teste;

import br.com.siqueira.javacore.enumeracao11.classe.Cliente;
import br.com.siqueira.javacore.enumeracao11.classe.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Anna", TipoCliente.PESSOA_JURIDICA);

        System.out.println(c1);
    }
}
