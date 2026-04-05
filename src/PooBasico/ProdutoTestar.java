package PooBasico;

public class ProdutoTestar {

    public static void main(String[] args) {
        // construtor padrão:
        Produto p1 = new Produto(); // <- isso é um objeto instaciado
        p1.nome = "Bolsa Preta";
        p1.marca = "Ferrari";
        p1.valor = 1.50f;

        //construtor de dois parâmetros:
        Produto p2 = new Produto("Caneta Azul", "Manoel Gomes ");
        p2.valor = 1.50f;


        //construtor de três parâmetros:
        Produto p3 = new Produto("Caderno", "Brastemp", 10.00f);


        //objeto p1
        System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " valor: " + p1.valor);
        //objeto p2
        System.out.println("Nome: " + p2.nome + " Marca: " + p2.marca + " valor: " + p2.valor);
        //objeto p3
        System.out.println("Nome: " + p3.nome + " Marca: " + p3.marca + " valor: " + p3.valor);
    }

}
