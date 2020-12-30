package br.com.siqueira.javacore.heranca8.classes;

public class Endereco {
    private String rua;
    private String bairro;

    public Endereco(){
        setRua("Indefinido");
        setBairro("Indefinido");
    }

    public Endereco(String rua, String bairro){
        setRua(rua);
        setBairro(bairro);
    }

    public void imprime(){
        System.out.println("Rua: " + getRua());
        System.out.println("Bairro: " + getBairro());
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getRua(){
        return this.rua;
    }

    public String getBairro(){
        return this.bairro;
    }

}
