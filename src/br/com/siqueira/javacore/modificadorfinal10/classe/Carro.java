package br.com.siqueira.javacore.modificadorfinal10.classe;

public class Carro {
    public static final double VElOCIDADE_FINAL = 250;
    private String nome;
    private String marca;
    public final Comprador COMPRADOR = new Comprador();



    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
}
