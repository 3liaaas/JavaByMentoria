package PooBasico;

public class Carro {
    //atributos
    String nome;
    String marca;
    int ano;
    int vel;

    // métodos
    void acelerar(int aceleracao){
        vel += aceleracao;
    }
    void frear(int reduzir){
        vel -=reduzir;
    }
    void buzinar(){
        System.out.println("bi");
    }
}
