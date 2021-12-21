package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaDiamante extends Consulta
{
  public double getConsulta()
  {
      return super.getConsulta() - (super.getConsulta() * 0.4);
  }
}
