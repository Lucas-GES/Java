package br.edu.unifil.lp1.consulta.modelo;
public class Consulta
{
    private String nome;
    private String matricula;
    private int dependentes;
    private int ano;
    private double consulta;
    
    
    
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    
    public void setDependentes(int dependentes)
    {
        this.dependentes = dependentes;
    }
    
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public void setConsulta(double consulta)
    {
        this.consulta = consulta;
    }    
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getMatricula()
    {
        return this.matricula;
    }
    
    public int getDependentes()
    {
        return this.dependentes;
    }
    
    public int getAno()
    {
        return this.ano;
    }
    
    public double getConsulta()
    {
        return this.consulta;
    }
}
