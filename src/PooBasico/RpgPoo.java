package PooBasico;

public class RpgPoo  {

    private String nome;
    private int nivel ;
    private int vida;
    private int mana;

    public RpgPoo (String nome, int nivel, int vida, int mana){
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
    }

    void ataque(){
        System.out.println(this.nome + " atacou!");
    }

    public static void main(String[] args) {
        RpgPoo elias = new RpgPoo("Elias", 1, 100, 50);
        elias.ataque();
    }

}
