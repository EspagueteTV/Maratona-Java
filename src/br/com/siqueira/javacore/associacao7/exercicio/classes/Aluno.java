package br.com.siqueira.javacore.associacao7.exercicio.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno() {

    }

    public Aluno(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public void print(){
        System.out.println("\n-=-= Relatório Aluno =-=-");
        System.out.printf("Nome: %s \n", getNome());
        System.out.printf("Idade: %d \n", getIdade());
        if(this.seminario != null){
            System.out.println("Seminário: " + this.seminario.getTitulo());
        }else{
            System.out.println("Aluno não esta inscrito em nenhum Seminário");
        }
    }


    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        setSeminario(seminario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public Seminario getSeminario() {
        return this.seminario;
    }
}
