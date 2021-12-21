package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaFamilia extends Consulta
{
  
 public double getConsulta()
 {
     if(super.getDependentes() > 2){
        return super.getConsulta() - (super.getConsulta() * 0.5);
    }else{
        return super.getConsulta();
    }
 }
}
