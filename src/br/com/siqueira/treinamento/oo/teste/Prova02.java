import br.com.siqueira.treinamento.oo.classes.Residencia;

public class Prova02 {
    public static void main(String[] args){
        Residencia residencia1 = new Residencia();
        Residencia residencia2 = new Residencia("15 de novembro", 153);

        System.out.println(residencia1.enderecoCompleto());
        System.out.println(residencia2.enderecoCompleto());
    }
}
