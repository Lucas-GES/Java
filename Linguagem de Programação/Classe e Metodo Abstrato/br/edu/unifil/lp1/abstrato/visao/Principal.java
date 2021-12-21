package br.edu.unifil.lp1.abstrato.visao;
import java.util.Scanner;
import br.edu.unifil.lp1.abstrato.controle.Controle;
import br.edu.unifil.lp1.abstrato.modelo.Mensalista;
import br.edu.unifil.lp1.abstrato.modelo.Comissionado;
import br.edu.unifil.lp1.abstrato.modelo.Horista;
import br.edu.unifil.lp1.abstrato.modelo.Producao;
import br.edu.unifil.lp1.abstrato.modelo.Funcionario;
public class Principal
{
    public static void getMenu(){
    System.out.println("Menu...........");
    System.out.println("1 - Cadastrar Funcionario");  
    System.out.println("2 - Consultar Funcionario");
    System.out.println("3 - Listar Funcionarios");
    System.out.println("9 - Encerrar");
}
    public static void submenu(){
        System.out.println("1 - Mensalista");
        System.out.println("2 - Comissionado");
        System.out.println("3 - Horista");
        System.out.println("4 - Producao");
    }
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Controle controle = new Controle();
        
        int opcao = 0;
        int matricula = 0;
        double quantidade = 0;
        double horas = 0;
        double vendas = 0;
        double comissao = 0;
        double salario = 0;
        String nome="";
        
        getMenu();
        while(opcao != 9){
            opcao = teclado.nextInt() ; teclado.nextLine();
            switch(opcao){
                case 1: System.out.println("Selecione o tipo de funcionario");
                         submenu();
                         int submenu = teclado.nextInt(); teclado.nextLine();                        
                         switch(submenu){
                             case 1:
                             System.out.println("Digite o nome: ");
                             nome = teclado.nextLine(); 
                             Mensalista mensalista = new Mensalista(nome);
                             System.out.println("Qual salario: ");
                             salario = teclado.nextDouble();
                             mensalista.setSalario(salario);
                             System.out.println("Digite o numero da Matricula: ");
                             matricula = teclado.nextInt();
                             mensalista.setMatricula(matricula);                             
                             controle.addFuncionario(mensalista);
                             System.out.println("Funcionario Criado com Sucesso!!!");
                             getMenu();
                             break;        
                             
                             case 2: 
                             System.out.println("Digite o Nome: ");
                             nome = teclado.nextLine();
                             Comissionado comissionado = new Comissionado(nome);
                             System.out.println("Qual salario: ");
                             salario = teclado.nextDouble();
                             comissionado.setSalario(salario);
                             System.out.println("Quanto de Comissao: ");
                             comissao = teclado.nextDouble();
                             comissionado.setComissao(comissao);
                             System.out.println("Vendeu Quanto: ");
                             vendas = teclado.nextDouble();
                             comissionado.setVendas(vendas);
                             System.out.println("Digite o numero da Matricula: ");
                             matricula = teclado.nextInt();
                             comissionado.setMatricula(matricula);
                             controle.addFuncionario(comissionado);
                             System.out.println("Funcionario Criado com Sucesso!!!");
                             getMenu();
                             break;        
                             
                             case 3: 
                             System.out.println("Digite o Nome: ");
                             nome = teclado.nextLine();
                             Horista horista = new Horista(nome);
                             System.out.println("Qual salario: ");
                             salario = teclado.nextDouble();
                             horista.setSalario(salario);
                             System.out.println("Trabalhou quantas horas: ");
                             horas = teclado.nextDouble();
                             horista.setHorasTrabalhada(horas);
                             System.out.println("Digite o numero da Matricula: ");
                             matricula = teclado.nextInt();
                             horista.setMatricula(matricula);
                             controle.addFuncionario(horista);
                             System.out.println("Funcionario Criado com Sucesso!!!");
                             getMenu();
                             break;       
                             
                             case 4: 
                             System.out.println("Digite o Nome: ");
                             nome = teclado.nextLine();
                             Producao producao = new Producao(nome);
                             System.out.println("Qual salario: ");
                             salario = teclado.nextDouble();
                             producao.setSalario(salario);
                             System.out.println("Quanto produziu: ");
                             quantidade = teclado.nextDouble();
                             producao.setQuantidade(quantidade);
                             System.out.println("Digite o numero da Matricula: ");
                             matricula = teclado.nextInt();
                             producao.setMatricula(matricula);
                             controle.addFuncionario(producao);
                             System.out.println("Funcionario Criado com Sucesso!!!");
                             getMenu();
                             break;       
                            }
                            break;
               case 2: System.out.println("Qual o nome do Funcionario: ");
                        nome = teclado.nextLine();
                        System.out.println(controle.getFuncionario(nome));
                        getMenu();
                        break;
                        
               case 3: System.out.println(controle.listaFuncionario());
                       getMenu();
                       break;
                       
               case 9: System.out.println("Ate a Proxima!!!");
            }               
        
        }
    }
}
