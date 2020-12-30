package br.com.siqueira.javacore.heranca8.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;


    public Pessoa() {
        setNome("Indefinido");
        setCpf("000.000.000-00");
    }

    public Pessoa(String nome, String cpf) {
        System.out.println();
        setNome(nome);
        setCpf(cpf);
    }

    public void imprimi() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        if (this.endereco != null) {
            System.out.println("Endereco: " + this.endereco.getRua() + ", " + this.endereco.getBairro());
        } else {
            System.out.println("Não foi cadastrado nenhum endereço");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
