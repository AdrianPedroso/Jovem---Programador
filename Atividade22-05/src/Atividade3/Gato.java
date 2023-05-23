package Atividade3;

public class Gato extends Animal {

    private String cor;

    public Gato(String nome, int idade, String tipo, String cor) {
        super(nome, idade, tipo);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
