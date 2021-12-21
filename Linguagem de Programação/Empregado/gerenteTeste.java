
/**
 * Escreva a descrição da classe gerenteTeste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class gerenteTeste
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Gerente chefe = new Gerente("Pedro",8000,3000);
        int menu = 0;
        
        System.out.println("Nome: " + chefe.getNome());
        System.out.println("Salario: " + chefe.getSalario() + "$");
        System.out.println("Bonus: " + chefe.getBonus() +"$");
        System.out.println("------------------");
        chefe.getMenu();
        
        while(menu != 9){
            menu = teclado.nextInt();
            teclado.nextLine();
            switch(menu){
                case 1: System.out.println("Digite o Nome do Gerente: ");
                chefe.setNome(teclado.nextLine());
                chefe.getMenu();
                break;
                
                case 2: System.out.println("Digite o Salario: ");
                chefe.setSalario(teclado.nextDouble());
                chefe.getMenu();
                break;
                
                case 3: System.out.println("Digite o Bonus: ");
                chefe.setBonus(teclado.nextDouble());
                chefe.getMenu();
                break;
                
                case 4: 
                System.out.println("Nome: " + chefe.getNome());
                System.out.println("Salario: " + chefe.getSalario() + "$");
                System.out.println("Bonus: " + chefe.getBonus() +"$");
                System.out.println("------------------");
                chefe.getMenu();
                break;
                
                default :
                if(menu > 9){
              System.out.println("Error404");
              chefe.getMenu();
             }else{
                System.out.println("Ate Mais!!!");
                }
                break;
            }
        
        }
              
        
    }
}
