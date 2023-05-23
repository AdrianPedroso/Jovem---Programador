package Atividade2;

public class Veiculo {

    private String marca;
    private double preco;
    private String modelo;



    public Veiculo(String marca, double preco, String modelo) {
        this.marca = marca;
        this.preco = preco;
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
