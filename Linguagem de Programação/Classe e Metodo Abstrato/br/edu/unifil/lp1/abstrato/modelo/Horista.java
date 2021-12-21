package br.edu.unifil.lp1.abstrato.modelo;

public class Horista extends Funcionario
{
    private double horas;
    
    public Horista(String nome){
        super(nome);
    }
    
    public double getHorasTrabalhadas(){
        return this.horas;
    }
    
    public void setHorasTrabalhada(double horas){
        this.horas = horas;
    }
    
    public double getGanhoMensal(){
        return super.getSalario() * this.horas;
    }
}
