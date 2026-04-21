package PooBasico;

public class MonkeyClasse {
    private String name;
    private boolean buchoCheio;
    private int idade;
    private boolean felicidade;

    private void brincar(){felicidade = true;}

    private void comerBanana(){
        if (buchoCheio = true){
            System.out.println("To de bucho cheio!");
        }
        ;}

    public static void main(String[] args) {
        MonkeyClasse elias = new MonkeyClasse();
        elias.brincar();

        MonkeyClasse fernanda = new MonkeyClasse();
        fernanda.comerBanana();
    }

}




// Não é possível instaciar objetos diretamente no corpo da classe.
//o certo é declarar um atributo ou criar um objeto dentro de um método;