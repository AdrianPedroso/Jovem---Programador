package Atividade3;

public class Main {
    
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Thor", 2, "Cachorro", "Caramelo");

        System.out.println("Nome: "+cachorro.getNome());
        System.out.println("Idade: "+cachorro.getIdade());
        System.out.println("Tipo: "+cachorro.getTipo());
        System.out.println("Raça: "+cachorro.getRaca());

        System.out.println(" ");

        Gato gato = new Gato("Miau", 3, "Gato", "Cinza");

        System.out.println("Nome: "+gato.getNome());
        System.out.println("Idade: "+gato.getIdade());
        System.out.println("Tipo: "+gato.getTipo());
        System.out.println("Cor: "+gato.getCor());
    }
}
