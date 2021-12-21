package br.edu.unifil.lp1.abstrato.modelo;

public class Comissionado extends Funcionario
{
  private double comissao;
  private double vendas;
  
  public Comissionado(String nome){
      super(nome);
  }
  
  public double getComissao(){
      return this.comissao;
  }
  
  public double getVendas(){
      return this.vendas;
  }
  
  public void setComissao(double comissao){
      this.comissao = comissao;
  }
  
  public void setVendas(double vendas){
      this.vendas = vendas;
  }
  
  public double getGanhoMensal(){
      return (super.getSalario() + this.comissao) * this.vendas;
  }
}
