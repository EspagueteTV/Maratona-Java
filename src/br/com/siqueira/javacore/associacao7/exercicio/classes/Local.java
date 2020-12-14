package br.com.siqueira.javacore.associacao7.exercicio.classes;

public class Local {
    private String rua;
    private String bairro;

    public Local(){

    }

    public Local(String rua, String bairro){
        setRua(rua);
        setBairro(bairro);
    }

    public void print(){
        System.out.println("\n-=-= Relatório Local =-=-");
        System.out.println("Rua: " + getRua());
        System.out.println("Bairro " + getBairro());
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
