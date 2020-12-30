package br.com.siqueira.javacore.heranca8.classes;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }


    public void imprimi(){
        super.imprimi();
        System.out.println("Salario: R$" + getSalario());
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + "o pagamento de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
