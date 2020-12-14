package br.com.siqueira.javacore.associacao7.exercicio.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor() {

    }

    public Professor(String nome, String especialidade) {
        setNome(nome);
        setEspecialidade(especialidade);
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this(nome, especialidade);
        setSeminario(seminario);
    }


    public void print(){
        System.out.println("\n-=-= Relatório Professor =-=-");
        System.out.println("Nome do Professor: " + getNome());
        System.out.println("Especialidade: " + getEspecialidade());
        if(this.seminario != null && seminario.length != 0){
            System.out.println("Seminarios participantes: ");
            for(Seminario sem : seminario){
                System.out.println("Título: " + sem.getTitulo());
            }
        }else{
            System.out.println("O professor não esta vínculado em nenhum seminário.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public Seminario[] getSeminario() {
        return this.seminario;
    }
}
