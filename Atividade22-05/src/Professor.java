



  public class Professor extends Funcionarios {
    
    private String disciplina;

    

    public Professor(String nome, int idade, double salario, String disciplina) {
        super(nome, idade, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
