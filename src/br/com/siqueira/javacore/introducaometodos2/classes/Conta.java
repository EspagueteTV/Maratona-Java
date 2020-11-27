package br.com.siqueira.javacore.introducaometodos2.classes;

public class Conta {
    public int numero;
    public String titular;
    public double saldo;

    public boolean saca(double quantidade){
        if(this.saldo < quantidade){
            return false;
        }else{
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }

    public void deposita(double quantidade){
        this.saldo += quantidade;
    }

    public void transferePara(Conta cont, double valor){
        this.saldo = this.saldo + valor;
        cont.saldo = cont.saldo + valor;
    }
}
