import java.util.Scanner;
public class MaiorTres
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        do{
            System.out.println("Numero1:");
            n1 = teclado.nextInt();
            System.out.println("Numero2:");
            n2 = teclado.nextInt();
            System.out.println("Numero3:");
            n3 = teclado.nextInt();
            
            if (n1 > n2 && n1 > n3){
                System.out.println(n1 + " é o maior");
            }else{
                if (n2 > n1 && n2 > n3){
                    System.out.println(n2 + " é o maior");
                }else{
                    System.out.println(n3 + " é o maior");
                }
            }
        }while (n1 != n2 && n2 != n3);
        System.out.println("Fim");

    }
}

