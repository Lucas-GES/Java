package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaOuro extends Consulta
{
        
    public double getConsulta()
    {
        if(getAno() <= 2000){
         return getConsulta() * 0;
        }else{
         return super.getConsulta() - (getConsulta() * 0.3);
       }
    }
}
