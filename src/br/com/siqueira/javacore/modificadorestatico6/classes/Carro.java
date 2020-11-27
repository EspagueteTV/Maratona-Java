package br.com.siqueira.javacore.modificadorestatico6.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;     // Velocidade limite deve ser 240 Km/h


    public Carro(String nome, double velocidadeMaxima){
        setNome(nome);
        setVelocidadeMaxima(velocidadeMaxima);
    }

    public void imprime(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + this.velocidadeLimite);
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
