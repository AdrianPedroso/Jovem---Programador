package Atividade10;

public class Main {
    
    public static void main(String[] args) {
        
        ContaPoupanca contaPoupanca = new ContaPoupanca("Adrian", 705.50, 0001, 1254, 1);

        System.out.println("Titular: "+contaPoupanca.getTitular());
        System.out.println("Saldo: "+contaPoupanca.getSaldo());
        System.out.println("Agência: "+contaPoupanca.getAgencia());
        System.out.println("Numero da Conta: "+contaPoupanca.getNumeroConta());
        System.out.println("Rendimento: "+contaPoupanca.getRendimento());

        System.out.println(" ");

        ContaEspecial contaEspecial = new ContaEspecial("Adrian", 690, 0002, 1253, 1000);

        System.out.println("Titular: "+contaEspecial.getTitular());
        System.out.println("Saldo: "+contaEspecial.getSaldo());
        System.out.println("Agência: "+contaEspecial.getAgencia());
        System.out.println("Numero da Conta: "+contaEspecial.getNumeroConta());
        System.out.println("Limite: "+contaEspecial.getLimite());

        contaEspecial.sacar(100);

        System.out.println(contaEspecial.getSaldo());

        contaEspecial.depositar(250);

        System.out.println(contaEspecial.getSaldo());




    }
}
