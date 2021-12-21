package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaPrata extends Consulta
{ 
  
  public double getConsulta()
  {      
      return super.getConsulta() - (super.getConsulta() * 0.2);
  }
}
