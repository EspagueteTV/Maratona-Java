package br.com.siqueira.javacore.introducaometodos.classes;

public class EstudanteV2 {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Notas: ");

        if (this.notas != null) {
            for (int i = 0; i < this.notas.length; i++) {
                System.out.printf("%.2f ", this.notas[i]);
            }
        } else {
            System.out.println("Não foi informado nenhuma nota");
        }

    }

    public void tirarMedia() {
        if (this.notas != null) {
            double media = 0;
            for (double valor : this.notas) {
                media += valor;
            }
            media = media / notas.length;

            System.out.printf("\n A média do aluno foi %.2f e ele está ", media);
            if (media < 7) {
                this.aprovado = false;
                System.out.println("Reprovado");
            } else {
                this.aprovado = true;
                System.out.println("Aprovado");
            }
        } else {
            System.out.println("[ERRO] Notas não informadas");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }else{
            System.out.println("Você não pode fazer isso!");
        }
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }
}
