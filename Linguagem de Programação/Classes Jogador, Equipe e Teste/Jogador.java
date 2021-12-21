
public class Jogador
{
    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao)
    {
        this.nome = nome;
        this.posicao = posicao;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getPosicao()
    {
        return this.posicao;
    }
}
