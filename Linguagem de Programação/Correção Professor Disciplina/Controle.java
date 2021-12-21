package ensino.controle;
import ensino.modelo.*;
import java.util.ArrayList;
public class Controle
{
    private ArrayList<Professor> listaProf;
    private ArrayList<Disciplina> listaDisc;

    public Controle()
    {
        listaProf = new ArrayList <Professor>();
        listaDisc = new ArrayList <Disciplina>();
    }

    public void addProfessor(Professor prof)
    {
        listaProf.add(prof);
    }
    
    public void addDisciplina(Disciplina disc)
    {
        listaDisc.add(disc);
    }
    
    public Professor getProfessor(String nome)
    {
        Professor prof;
        for(int i = 0; i < listaProf.size(); i++)
        {
            prof = listaProf.get(i);
            
            if (prof.getNome().equals(nome))
            {
                return prof;
            }
        }
        return null;
    }
    
    public String getNomeProfessor(String disciplina)
    {
        Professor prof;
        Disciplina disc;
        for(int i = 0; i < listaDisc.size(); i++)
        {
            disc = listaDisc.get(i);
            if (disc.getNome().equals(disciplina))
            {
                prof = disc.getProfessor();
                return prof.getNome();
            }
        }
        return null;
    }
    
    public String getProfessorTitulacao(String titulacao)
    {
        String saida = "";
        Professor prof;
        for(int i = 0; i < listaProf.size(); i++)
        {
            prof = listaProf.get(i);
            
            if (prof.getTitulacao().equals(titulacao))
            {
                saida = saida + prof.getNome() + '\n';
            }
        }
        return saida;
    }
}
