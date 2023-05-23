


public class Main {

    public static void main(String[] args) {
        
    Professor professor1 = new Professor("Adrian", 25, 4000, "Fisica");
    

    System.out.println("Nome: "+professor1.informacoes());
    System.out.println("Idade: "+professor1.getIdade());
    System.out.println("Salario: "+professor1.getSalario());
    System.out.println("Disciplina: "+professor1.getDisciplina());

    System.out.println(" ");

    Administrativo administrativo1 = new Administrativo("Jose", 33, 6000, "RH");

    System.out.println("Nome: "+administrativo1.getNome());
    System.out.println("Idade: "+administrativo1.getIdade());
    System.out.println("Salario: "+administrativo1.getSalario());
    System.out.println("Setor: "+administrativo1.getSetor());

    
   }
}
