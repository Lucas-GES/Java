package br.edu.unifil.lp1.consulta.visao;
import java.util.Scanner;
import br.edu.unifil.lp1.consulta.controle.CadastroDeConsultas;
public class SistemaDaClinica
{    
   public static void main(String args[]){
       int opcao = 0;              
       Scanner teclado = new Scanner(System.in);
       String consulta;
       CadastroDeConsultas cadastro = new CadastroDeConsultas();
       
       cadastro.getMenu();
       while(opcao != 9){
           opcao = teclado.nextInt() ; teclado.nextLine();          
           cadastro.getMenu();
           switch(opcao){               
               case 1: cadastro.addConsulta();                       
                       break;
               
               case 2:  System.out.println("Digite o nome Plano para pesquisa: ");                        
                        consulta = teclado.nextLine();
                        System.out.println(cadastro.listarPacientes(consulta));
                        cadastro.getMenu();
                        break;
               
               case 3: System.out.println("Digite o nome Plano para pesquisa: ");
                        String total = teclado.nextLine();
                        System.out.println("Total de Consultas: " + cadastro.totalConsulta(total));                        
                        cadastro.getMenu();
                        break;
               
               case 4: System.out.println("Digite o nome do Plano para pesquisa");
                        String valorTotal = teclado.nextLine();
                        System.out.println("Valor total das Consulta(s): " + cadastro.valorTotalConsulta(valorTotal) + "$");
                        cadastro.getMenu();
                        break;
               
               default: if(opcao == 9){
                   System.out.println("Ate Logo");
                }else{
                   System.out.println("Error404");
                   cadastro.getMenu();
                }
           }
       }
   
   }
}
