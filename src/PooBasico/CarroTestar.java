package PooBasico;

public class CarroTestar {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.nome = "Uno Fire";
        c1.marca = "Fiat";
        c1.ano = 2004;
        c1.vel = 60;

        c1.acelerar(10);
            System.out.println(c1.vel);
        c1.frear(30);
            System.out.println(c1.vel);
    }
}
