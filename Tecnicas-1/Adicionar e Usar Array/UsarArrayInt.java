
/**
 * Escreva a descrição da classe UsarArrayInt aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class UsarArrayInt
{       
    /**
     * COnstrutor para objetos da classe UsarArrayInt
     */
    
    public static void main(String args[])
    {        
        Scanner teclado = new Scanner(System.in);
        ArrayInt arr = new ArrayInt(5); // Classe Obj = new Construtor()
        int id = 0;
        
                
        System.out.println("Menu de Array");
        System.out.println("Digite 1 para adicionar um Array");
        System.out.println("Digite 2 para visualizar o Array");
        System.out.println("Digite 3 para editar um Elemento do Array");
        System.out.println("Digite 4 para ordenar o Array");
        System.out.println("Digite 9 para Sair");
        
        while(id != 9){
            id = teclado.nextInt();
            teclado.nextLine();
           switch(id){
                case 1 : System.out.println("Digite o Elemnto: ");
                arr.addArray();
                System.out.println("------------------------------------------");
                System.out.println("Digite 2 para visualizar o Array");
                System.out.println("Digite 3 para editar um Elemento do Array");
                System.out.println("Digite 4 para ordenar o Array");
                System.out.println("Digite 9 para Sair");
                System.out.println("------------------------------------------");
                break;
                
                case 2 : System.out.println(arr.getArray());
                System.out.println("------------------------------------------");
                System.out.println("Digite 2 para visualizar o Array");
                System.out.println("Digite 3 para editar um Elemento do Array");
                System.out.println("Digite 4 para ordenar o Array");
                System.out.println("Digite 9 para Sair");
                System.out.println("------------------------------------------");
                break;
                
                case 3 : System.out.println("Digite a posição do numero a ser alterado e seu novo valor: ");
                arr.setElemento(teclado.nextInt() , teclado.nextInt());
                System.out.println("------------------------------------------");
                System.out.println("Digite 2 para visualizar o Array");
                System.out.println("Digite 3 para editar um Elemento do Array");
                System.out.println("Digite 4 para ordenar o Array");
                System.out.println("Digite 9 para Sair");
                System.out.println("------------------------------------------");
                break;
                
                case 4 : System.out.println("Array Ordenado com Sucesso");
                arr.setOrdenar();
                System.out.println("------------------------------------------");
                System.out.println("Digite 2 para visualizar o Array");
                System.out.println("Digite 3 para editar um Elemento do Array");
                System.out.println("Digite 4 para ordenar o Array");
                System.out.println("Digite 9 para Sair");
                System.out.println("------------------------------------------");
                break;
                
                default : 
                if(id > 9){
                System.out.println("Invalido");
               }
                System.out.println("------------------------------------------");
                System.out.println("Digite 2 para visualizar o Array");
                System.out.println("Digite 3 para editar um Elemento do Array");
                System.out.println("Digite 4 para ordenar o Array");
                System.out.println("Digite 9 para Sair");
                System.out.println("------------------------------------------");
                break;
            }
        }
    }
    
}
