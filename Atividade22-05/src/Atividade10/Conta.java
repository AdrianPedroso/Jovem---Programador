package Atividade10;

public class Conta {
    
    private String titular;
    protected double saldo;
    private int agencia;
    private int numeroConta;

    
    public Conta(String titular, double saldo, int agencia, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numeroConta = numeroConta;

    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
