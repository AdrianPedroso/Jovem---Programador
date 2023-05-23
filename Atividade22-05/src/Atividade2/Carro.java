package Atividade2;

public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro(String marca, double preco, String modelo, int numeroPortas) {
        super(marca, preco, modelo);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
