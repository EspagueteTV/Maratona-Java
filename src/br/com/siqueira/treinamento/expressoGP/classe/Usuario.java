package br.com.siqueira.treinamento.expressoGP.classe;


import java.util.Scanner;

public class Usuario {

    private static String nome;

    public static void setNome(String nome){
        Usuario.nome = nome;
    }

    public static String getNome(){
        return Usuario.nome;
    }


    public static int mostrarMenu(){
        Scanner teclado = new Scanner(System.in);
        boolean op = true;
        int opcao = 0;

        while(op){
            System.out.println("================================");
            System.out.println("\t Expresso GP ");
            System.out.println("================================");
            System.out.println("1 - Cadastrar Cliente ");
            System.out.println("2 - Cadastrar Serviço ");
            System.out.println("3 - Sair ");
            System.out.println("================================");
            System.out.print("Sua opção: ");
            opcao = teclado.nextInt();

            if(opcao > 3){
                System.out.println("[ERRO] Por favor informe um valor válido");
            }else{
                break;
            }
        }
        return opcao;
    }


}
