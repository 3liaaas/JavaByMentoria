
// CLASSE: a classe/molde neste caso é Usuário
public class Usuario {

    //dentro da classe vai os atributos e características do obejeto correspondente
    private String nome;
    private String email;
    private int nivelAcesso;
    private boolean contaBloqueada;

    // CONSTRUTOR: chamado ao criar um novo objeto
    public Usuario(String nome, String email, int nivelAcesso) {
        this.nome = nome;
        this.email = email;
        this.nivelAcesso = nivelAcesso;
        this.contaBloqueada = false; // a conta inicia desbloqueada
    }
    // MÉTODO: comportamento do objeto
    public boolean podeLer() {
        return !contaBloqueada && nivelAcesso >= 1;
    }
    public boolean podeEscrever() {
        return !contaBloqueada && nivelAcesso >= 2;
    }
    public void bloquearConta() {
        this.contaBloqueada = true;
        System.out.println("Conta de " + nome + " bloqueada.");
    }
    public String getNome() {return nome;}
    public String getEmail() {return email;}

    public static void main(String [] args) {
        Usuario elias = new Usuario("Elias", "elias123@gmail.com", 3);
        Usuario alice = new Usuario("Alice", "alice123@gmail.com", 1);

        System.out.println(alice.getNome() + " pode escrever? " + alice.podeEscrever());
        System.out.println(elias.getNome() + " pode escrever? " + elias.podeEscrever());
    }



}

