package ensino.visao;

import java.util.Scanner;
import ensino.controle.Controle;
import ensino.modelo.*;
public class Principal
{
    public static void main(String args[])
    {
        Controle ctr = new Controle();
        Scanner teclado = new Scanner(System.in);
        String nome, titulacao, disciplina;
        Professor professor;
        int opcao = 0;
        int idade;
        while(opcao != 9){
            System.out.println("1-cadastrar professor");
            System.out.println("2-cadastrar disciplina");
            System.out.println("3-consulta professor por disciplina");
            System.out.println("4-consulta professor por titulação");
            System.out.println("9-fim");
            opcao = teclado.nextInt(); teclado.nextLine();
            switch(opcao){
                case 1 : System.out.print("Nome: ");
                         nome = teclado.nextLine();
                         System.out.print("Idade: ");
                         idade = teclado.nextInt(); teclado.nextLine();
                         System.out.print("Titulação:");
                         titulacao = teclado.nextLine();
                         ctr.addProfessor(new Professor(nome, idade, titulacao));
                         break;
                case 2 : System.out.print("Disciplina: ");
                         disciplina = teclado.nextLine();
                         System.out.print("Professor: ");
                         nome = teclado.nextLine();
                         professor = ctr.getProfessor(nome);
                         if (professor != null)
                         {
                            ctr.addDisciplina(new Disciplina(disciplina, professor));    
                         }else{
                             System.out.println("Professor não existe");
                         }
                         break;
                case 3 : System.out.print("Disciplina: ");
                         disciplina = teclado.nextLine();
                         System.out.println("Professor: " + ctr.getNomeProfessor(disciplina));
                         break;
                case 4 : System.out.print("Titulação:");
                         titulacao = teclado.nextLine();
                         System.out.println(ctr.getProfessorTitulacao(titulacao));
                         break;
            }
        }
        
        
    }
}
