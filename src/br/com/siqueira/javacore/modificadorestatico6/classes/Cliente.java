package br.com.siqueira.javacore.modificadorestatico6.classes;

public class Cliente {

    // 0 ª Bloco de Inicialização estatico é executado quanta a JVM carregar a classe (executado apenas uma vez)
    // 1ª Alocado espaço na memória para o objeto que será criado
    // 2ª Cada atributo de classe é criado e iniciado com seus valores default ou valores explicitos
    // 3ª Bloco de inicialização é executado
    // 4ª O construtor é executado


    private static int[] parcelas;

    // Criar bloco de inicialização
    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de Inicialização Estático ");
        for(int i = 1; i <= 100; i++){
            parcelas[i - 1] = i;
        }
    }

    {
        System.out.println("Bloco de Inicialização não estático");
    }

    public Cliente()  {

    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
