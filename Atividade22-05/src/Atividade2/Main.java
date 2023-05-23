package Atividade2;

public class Main {

    public static void main(String[] args) {
        
       Carro carro = new Carro("Nissan", 250000, "GT-R34", 2);


        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Preço: "+carro.getPreco());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Numero de Portas: "+carro.getNumeroPortas());

        System.out.println(" ");

        Moto moto = new Moto("Kawasaki", 60000, "Ninja", 300);

        System.out.println("Marca: "+moto.getMarca());
        System.out.println("Preço: "+moto.getPreco());
        System.out.println("Modelo: "+moto.getModelo());
        System.out.println("Cilindradas: "+moto.getCilindradas()+"cc");

    }
    
}
