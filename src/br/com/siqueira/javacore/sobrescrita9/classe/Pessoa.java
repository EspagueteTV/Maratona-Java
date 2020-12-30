package br.com.siqueira.javacore.sobrescrita9.classe;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        setNome("Indefinido");
        setIdade(0);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
