package PooBasico;

public class balde {
    // atributos
    private double capacidade;
    private String estado;
    private double valor;
    private String cor;

    // métodos
    public void armazenarAgua(){
        System.out.println("Armazenando água");
    }
    public void despejarAgua(){
        System.out.println("Despejando água");
    }

    public static void main(String[] args) {
        balde baldePreto = new balde();
        baldePreto.capacidade = 2.0;
        baldePreto.estado = "novo";
        baldePreto.valor = 10.00;
        baldePreto.cor = "preto";
    }
}


