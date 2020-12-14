package br.com.siqueira.javacore.associacao7.exercicio.classes;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Professor professor;
    private Local local;

    public Seminario() {

    }

    public Seminario(String titulo) {
        setTitulo(titulo);
    }

    public Seminario(String titulo, Aluno[] aluno, Professor professor, Local local) {
        setTitulo(titulo);
        setAluno(aluno);
        setProfessor(professor);
        setLocal(local);
    }

    public void print() {
        System.out.println("\n-=-= Relatório Seminário =-=-");
        System.out.println("Título: " + getTitulo());

        if (this.professor != null)
            System.out.println("Professor palestrante: " + this.professor.getNome());
        else
            System.out.println("Nenhum professor cadastrado no seminário.");

        if (this.local != null) {
            System.out.println("Local, " + this.local.getRua() + " bairro " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado no seminário.");
        }

        if (this.aluno != null && this.aluno.length != 0) {
            System.out.println("Alunos participantes: ");
            for (Aluno aluno : this.aluno) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Nenhum aluno cadastrado no seminário.");
        }

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Aluno[] getAluno() {
        return this.aluno;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public Local getLocal() {
        return this.local;
    }
}
