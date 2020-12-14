package br.com.siqueira.javacore.heranca8.classes;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprimi(){
        super.imprimi();
        System.out.println("Salario: R$" + getSalario());
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
