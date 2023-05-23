package Atividade10;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(String titular, double saldo, int agencia, int numeroConta, double limite) {
        super(titular, saldo, agencia, numeroConta);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor) {
       saldo += limite - (valor);

    }

    public void depositar(double valor) {
        saldo += (valor);
    }

    
}


