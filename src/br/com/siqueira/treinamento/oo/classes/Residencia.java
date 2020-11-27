package br.com.siqueira.treinamento.oo.classes;

public class Residencia {
    private String endereco;
    private int numero;

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getNumero() {
        return this.numero;
    }

    public Residencia() {
        this.endereco = " ";
        this.numero = 000;
    }

    public Residencia(String endereco, int numero) {
        setEndereco(endereco);
        setNumero(numero);
    }

    public String enderecoCompleto() {
        return this.endereco + " , " + this.numero;
    }
}
