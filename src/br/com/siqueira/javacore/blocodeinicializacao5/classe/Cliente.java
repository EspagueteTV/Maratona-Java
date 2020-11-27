package br.com.siqueira.javacore.blocodeinicializacao5.classe;

public class Cliente {

    // 1ª Alocado espaço na memória para o objeto que será criado
    // 2ª Cada atributo de classe é criado e iniciado com seus valores default ou valores explicitos
    // 3ª Bloco de inicialização é executado
    // 4ª O construtor é executado


    private int[] parcelas;

    // Criar bloco de inicialização
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de Inicialização ");
        for(int i = 1; i <= 100; i++){
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
        System.out.println("Dentro do Construtor");
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
