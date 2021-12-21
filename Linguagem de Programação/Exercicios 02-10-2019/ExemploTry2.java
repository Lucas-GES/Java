import java.util.Scanner;
import java.util.InputMismatchException;
public class ExemploTry2
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int a=0;
        int cont=0;
        
        do{
            try{
                System.out.print("A: ");
                a = teclado.nextInt();
                cont++;
            }
            catch (Exception e){
                System.out.println("Erro");
                teclado.nextLine();
                // 1) chame os métodos getMessage() e printStackTrace();
            }
        }while(a > 0);
        System.out.println("Quantidade de entrada de dados: " + cont);
        //2) Faça o cont++ para incrementar todas as entradas de dados corretas e incorretas em uma única linha de código.
    }    
}
