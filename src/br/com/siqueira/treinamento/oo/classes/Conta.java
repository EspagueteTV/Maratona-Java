package br.com.siqueira.treinamento.oo.classes;

import java.util.*;

public class Conta {

    private String nome;
    private int numeroConta;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.print("[ERRO] Valor informado não poderá ser sacado");
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosImpresao(){
        String dados = "Titular: " + this.nome;
        dados += ("\nNúmero Da Conta: " + this.numeroConta);
        dados += ("\nAgencia: " + this.agencia);
        dados += ("\nSaldo Atual: " + this.saldo);
        dados += ("\nData de Abertura Conta: " + this.dataAbertura);

        return dados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getDataAbertura() {
        return this.dataAbertura;
    }
}
