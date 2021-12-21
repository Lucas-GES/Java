package ensino.modelo;

public class Disciplina
{
    private String nome;
    private Professor professor;
    
    public Disciplina(String nome, Professor professor)
    {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome()
    {
        return nome;
    }
    
    public Professor getProfessor()
    {
        return this.professor;
    }
    
    public void setNome(String nome)
    {
        if (!nome.trim().equals("")){
            this.nome = nome;
        }

    }
    
    public void setProfessor(Professor prof)
    {
        if (prof != null){
            this.professor = prof;
        }
    }
}
