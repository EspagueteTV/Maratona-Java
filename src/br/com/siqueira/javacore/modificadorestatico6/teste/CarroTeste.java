package br.com.siqueira.javacore.modificadorestatico6.teste;

import br.com.siqueira.javacore.modificadorestatico6.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        System.out.println(Carro.getVelocidadeLimite());
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("Mercedes", 290);


        carro1.imprime();
        carro2.imprime();
        carro3.imprime();


    }
}
