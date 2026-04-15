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
    public boolean sacar(double valor){
        if(valor <= 0 || valor > saldo) {
            System.out.println("Saque inválido ou saldo insuficiente");
            return false;
        }
        saldo -= valor;
        return true;
    }
}

ContaBancaria conta = new ContaBancaria("001-5", 1000.0);
conta.sacar(250.0);
