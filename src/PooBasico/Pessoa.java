package PooBasico;

public class Pessoa {
    // atributos de pessoa
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        //método, o que a pessoa vai fazer
        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
    }

    //Getters e Setters, controlando acesso dos atributos
    public String getNome(){ return nome;}
    public void setNome(String nome){ this.nome = nome;}
}
