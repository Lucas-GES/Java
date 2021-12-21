package br.edu.unifil.lp1.consulta.controle;
import java.util.ArrayList;
import java.util.Scanner;
import br.edu.unifil.lp1.consulta.modelo.Consulta;
import br.edu.unifil.lp1.consulta.modelo.ConsultaPrata;
import br.edu.unifil.lp1.consulta.modelo.ConsultaOuro;
import br.edu.unifil.lp1.consulta.modelo.ConsultaDiamante;
import br.edu.unifil.lp1.consulta.modelo.ConsultaFamilia;
public class CadastroDeConsultas 
{
  ArrayList<Consulta> listaConsulta = new ArrayList();  
  Scanner teclado = new Scanner(System.in);
    
   public static void getMenu(){
       System.out.println("1 - Para incluir nova consulta");
       System.out.println("2 - Listar pacientes pelo plano");
       System.out.println("3 - Listar o total de consulta por Plano");
       System.out.println("4 - Verificar o valor total das Consultas");
       System.out.println("9 - Finalizar");
   }
    
  public static void getPlano(){
      System.out.println("1 - Para o Plano Prata");
      System.out.println("2 - Para o Plano Ouro");
      System.out.println("3 - Para o Plano Diamante");
      System.out.println("4 - Para o Plano Familia");
  }
  
  public void addConsulta()
  {        
    Consulta cons;
    System.out.println("Digite o Nome: ");
    String nome = teclado.nextLine();        
    System.out.println("Digite a Matricula: ");
    String matricula = teclado.nextLine();
    System.out.println("Digite o numero de Dependentes: ");
    int dependentes = teclado.nextInt();
    System.out.println("Digite o Ano de Cadastro: ");
    int ano = teclado.nextInt();
    System.out.println("Digite o valor da Consulta: ");
    double valor = teclado.nextDouble();
    CadastroDeConsultas.getPlano();
    int plano = teclado.nextInt();
    switch(plano){
        case 1:
        cons = new ConsultaPrata();       
        cons.setNome(nome);         
        cons.setMatricula(matricula);        
        cons.setDependentes(dependentes);        
        cons.setAno(ano);                
        cons.setConsulta(valor);
        listaConsulta.add(cons);
        getMenu();
        break;
        
        case 2:
        cons = new ConsultaOuro();               
        cons.setNome(nome);         
        cons.setMatricula(matricula);        
        cons.setDependentes(dependentes);        
        cons.setAno(ano);                
        cons.setConsulta(valor);   
        listaConsulta.add(cons);
        getMenu();
        break;
        
        case 3:
        cons = new ConsultaDiamante();
        cons.setNome(nome);         
        cons.setMatricula(matricula);        
        cons.setDependentes(dependentes);        
        cons.setAno(ano);                
        cons.setConsulta(valor); 
        listaConsulta.add(cons);
        getMenu();
        break;
        
        case 4:
        cons = new ConsultaFamilia();
        cons.setNome(nome);         
        cons.setMatricula(matricula);        
        cons.setDependentes(dependentes);        
        cons.setAno(ano);                
        cons.setConsulta(valor);
        listaConsulta.add(cons);
        getMenu();
        break;
    } 
  }
  
  public String listarPacientes(String consulta){
      Consulta con;
      String saida="";
      String getClass="";
      
      for (int i=0 ; i < listaConsulta.size(); i++){
          con = listaConsulta.get(i);
          getClass = con.getClass().toString().replaceFirst("class br.edu.unifil.lp1.consulta.modelo.Consulta" , "").toLowerCase();
          if(getClass.equals(consulta.toLowerCase())){
              saida += "Matricula: " + con.getMatricula() + "Nome: " + con.getNome() + '\n';
            }
       }
      return saida;
  }
  
  public int totalConsulta(String consulta){
      Consulta con;
      int contador=0;
      String getClass="";
      
      for (int i=0 ; i < listaConsulta.size(); i++){
          con = listaConsulta.get(i);
          getClass = con.getClass().toString().replaceFirst("class br.edu.unifil.lp1.consulta.modelo.Consulta" , "").toLowerCase();
          if(getClass.equals(consulta.toLowerCase())){
              contador++;
            }
       }
      return contador;
  }
  
  public double valorTotalConsulta(String consulta){
      Consulta con;
      double valor=0;
      String getClass="";
      
      for (int i=0 ; i < listaConsulta.size(); i++){
          con = listaConsulta.get(i);
          getClass = con.getClass().toString().replaceFirst("class br.edu.unifil.lp1.consulta.modelo.Consulta" , "").toLowerCase();
          if(getClass.equals(consulta.toLowerCase())){
              valor += con.getConsulta();
            }
       }
      return valor;
   }
}
