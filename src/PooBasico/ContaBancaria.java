package PooBasico;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;
    public ContaBancaria(String numeroConta, double saldoInicial){
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;

    }
    // Getter: exposição controlada para somente leitura
    public double getSaldo(){
        return saldo;
    }

    // método com regra de negócio, não deixando setar o saldo diretamente
    public boolean sacar
}
