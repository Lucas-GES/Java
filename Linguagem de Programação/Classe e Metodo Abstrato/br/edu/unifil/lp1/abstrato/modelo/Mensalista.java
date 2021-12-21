package br.edu.unifil.lp1.abstrato.modelo;

public class Mensalista extends Funcionario
{
   public Mensalista(String nome){
       super(nome);
       
   }
   
   public double getGanhoMensal(){
       return super.getSalario();
   }
}
