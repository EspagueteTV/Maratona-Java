package br.com.siqueira.treinamento.expressoGP.classe;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String telefone;

    private Scanner teclado = new Scanner(System.in);

    public Cliente(){

    }

    public Cliente(String nome, String telefone){
        setNome(nome);
        setTelefone(telefone);
    }


    public void AlterarCliente(){
        System.out.println("Qual das opções deseja atualizar: ");
        System.out.println("1 - Telefone ");
        System.out.println("2 - Endereço ");
        System.out.println("3 - Sair");
        System.out.print("Sua opção: ");
            int opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                System.out.printf("Novo número de Telefone do cliente %s: ", getNome());
                    setTelefone(teclado.next());
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
