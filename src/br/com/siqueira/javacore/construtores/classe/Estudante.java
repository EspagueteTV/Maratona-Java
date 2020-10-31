package br.com.siqueira.javacore.construtores.classe;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }

    public Estudante() {
        System.out.println("Construtor Default");
    }

    public void imprimi() {
        System.out.println("-=-=-= DADOS DO ALUNO =-=-=-");
        System.out.printf("Nome: %s \n", this.nome);
        System.out.printf("Matricula: %s \n", this.matricula);
        System.out.print("Notas: ");
        for (double nota : this.notas) {
            System.out.print(nota + ", ");
        }
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-= ");
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
