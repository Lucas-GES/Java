package ensino.modelo;

public class Professor extends Pessoa
{
    private String titulacao;

    public Professor(String nome, int idade, String titulacao)
    {
        super(nome,idade);
        this.titulacao = titulacao;
    }

    public String getTitulacao()
    {
        return this.titulacao;
    }
    
    public void setTitulacao(String titulacao)
    {
        if (!titulacao.trim().equals("")){
            this.titulacao = titulacao;
        }
    }
}
