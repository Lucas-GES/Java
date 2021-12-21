package br.edu.unifil.lp1.abstrato.modelo;

public abstract class Funcionario extends Pessoa
{
    private int matricula;
    protected double salario;
    
    public Funcionario(String nome){
        super(nome);        
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public abstract double getGanhoMensal();
}
