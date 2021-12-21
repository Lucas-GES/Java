import java.util.ArrayList;
public class Equipe
{
    private String nome;
    private ArrayList<Jogador> listaJog;
 
    public Equipe(String nome)
    {
        this.nome = nome;
        listaJog = new ArrayList();
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void addJogador(Jogador jog)
    {
        listaJog.add(jog);
    }
    
    public void removeJogador(Jogador j)
    {
        listaJog.remove(j);
    }
    
    public String getListaJog()
    {
        String saida="";
        Jogador jog;
        for(int i=0; i<listaJog.size(); i++)
        {
            jog = listaJog.get(i);
            saida = saida + jog.getNome() + " " + jog.getPosicao() + '\n';
        }
        return saida;
    }
    
    public Jogador getJogador(String nome)
    {
        Jogador jog;
        for(int i=0; i<listaJog.size(); i++)
        {
            jog = listaJog.get(i);
            if (jog.getNome().equals(nome)){
                return jog;
            }
        }
        return null; //retorna null quando não encontra o nome
    }
}
