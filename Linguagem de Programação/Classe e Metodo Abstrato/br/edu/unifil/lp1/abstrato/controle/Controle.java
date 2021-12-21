package br.edu.unifil.lp1.abstrato.controle;
import br.edu.unifil.lp1.abstrato.modelo.Funcionario;
import java.util.ArrayList;
public class Controle
{
  private ArrayList<Funcionario> listaEmp = new ArrayList();
  
  public void addFuncionario(Funcionario funcionario){
      listaEmp.add(funcionario);
  }
  
  public String getFuncionario(String nome){
      String saida ="";
      Funcionario funcionario;
      for(int i=0; i < listaEmp.size() ;i++){
          funcionario = listaEmp.get(i);
          if(funcionario.getNome().equals(nome)){
              saida += "Nome: " + funcionario.getNome() + '\n' 
              + "Matricula: " + funcionario.getMatricula() +'\n'
              + "Ganho Mensal: " + funcionario.getGanhoMensal() 
              ;
            }
      }
      return saida;
  }
  
  public String listaFuncionario(){
      String saida = "";
      Funcionario funcionario;
    for(int i=0; i < listaEmp.size() ;i++){        
             funcionario = listaEmp.get(i);          
             saida += "Nome: " + funcionario.getNome() + '\n' 
              + "Matricula: " + funcionario.getMatricula() +'\n'
              + "Ganho Mensal: " + funcionario.getGanhoMensal() 
              + '\n' + '\n'
              ;
                     
            }      
    return saida;
}
}
