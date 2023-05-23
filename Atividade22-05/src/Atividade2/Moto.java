package Atividade2;

public class Moto extends Veiculo {

    

    public Moto(String marca, double preco, String modelo, int cilindradas) {
        super(marca, preco, modelo);
        this.cilindradas = cilindradas;
    }

    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    
}
