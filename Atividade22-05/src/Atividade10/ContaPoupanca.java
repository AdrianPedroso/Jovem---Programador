package Atividade10;

public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(String titular, double saldo, int agencia, int numeroConta, double rendimento) {
        super(titular, saldo, agencia, numeroConta);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
}
