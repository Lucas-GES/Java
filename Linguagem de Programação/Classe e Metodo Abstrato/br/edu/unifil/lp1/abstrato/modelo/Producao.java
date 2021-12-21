package br.edu.unifil.lp1.abstrato.modelo;

public class Producao extends Funcionario
{
    private double quantidade;
        
    public Producao(String nome){
        super(nome);
    }
    
    public double getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }
    
    public double getGanhoMensal(){
        return super.getSalario() * this.quantidade;
    }
}
