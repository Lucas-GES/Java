package ensino.modelo;

public class Pessoa
{
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome()
    {
        return this.nome;
    }

    public int getIdade()
    {
        return this.idade;
    }
    
    public void setNome(String nome)
    {
        if (!nome.trim().equals("")){
            this.nome = nome;
        }
    }
    
    public void setIdade(int idade)
    {
        if (idade >= 0){
            this.idade = idade;
        }
    }
}
