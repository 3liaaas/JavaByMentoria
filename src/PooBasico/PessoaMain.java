package PooBasico;

public class PessoaMain {
    public  static void main(String[] args) {
        Pessoa p1 = new Pessoa ("Elias", 21);
        Pessoa p2 = new Pessoa ("Fernanda", 17);

        p1.apresentar();
        p2.apresentar();

        System.out.println(p1.getNome());
        /*
        como deve pensar em POO:

        Você define a classe  →  Java aprende que existe esse tipo
        Você faz new Classe() →  Java cria um objeto desse tipo na memória
        Você chama objeto.metodo() →  O objeto executa o comportamento com seus próprios dados
*        */
    }
}
