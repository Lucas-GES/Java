import java.util.Scanner;
import java.util.InputMismatchException;
public class TesteUsaArrayInt
{
    public static void getMenu(){
        System.out.println("Menu________________");
        System.out.println("1 - Carregar Array");
        System.out.println("2 - Mostrar Numeros Armazenados No Array");
        System.out.println("3 - Mostrar numero de um Array");
        System.out.println("4 - Dividir Array A por B");
        System.out.println("5 - Mostrar Numeros iguais dos Arrays");
        System.out.println("6 - Mostrar Numeros Diferentes dos Arrays");
        System.out.println("9 - Encerrar");
    }
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        UsaArrayInt ar = new UsaArrayInt();
        
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int opcao = 0;
        
        
       getMenu();
       // Faça um menu com opções para:
       // a) carregar um array 
       // b) mostrar os numéros armazenados em um array 
       // c) mostrar o número armazenado em um array e indice específico
       // d) atualizar o array c com a divisão do array a pelo b
       // e) atualizar o array c com a interseção do array a e b
       // f) atualizar o array c com a diferença do array a por b
       // g) faça o tratamento de exceção
      
       while (opcao != 9){
        try{
            opcao = teclado.nextInt() ; teclado.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Erro na entrada de dados");
            break;
        }
        switch(opcao){
            case 1:try{
                   System.out.println("Digite o Array A: ");
                   ar.carregaArray(a);
                   System.out.println("Digite o Array B: ");
                   ar.carregaArray(b);
                }catch(InputMismatchException e){
                    System.out.println("Erro na entrada de dados");
                }
                   getMenu();
                   break;
                   
            case 2: System.out.println(ar.mostraArray(a));
                    System.out.println(ar.mostraArray(b));
                    getMenu();
                    break;
                    
            case 3: try{
                    System.out.println("Digite o indice do array A: ");
                    System.out.println(ar.mostraArray(a,teclado.nextInt()));
                    System.out.println("Digite o indice do array B: ");
                    System.out.println(ar.mostraArray(b,teclado.nextInt()));
                   }catch(ArrayIndexOutOfBoundsException erro){
                    System.out.println("Erro na entrada de dados - operaçao cancelada");
                   }
                    getMenu();
                    break;
                    
            case 4: c = ar.geraArrayDivisao(a,b);
                    for(int i=0 ; i<c.length ; i++){
                       System.out.print(c[i] + ",");
                    }
                
                    getMenu();
                    break;
            case 5: c = ar.geraArrayInter(a,b);
                     for(int i=0 ; i<c.length ; i++){
                       System.out.print(c[i] + ",");
                    }
                    System.out.print("\n");
                    getMenu();
                    break;
            case 6: c = ar.geraArrayDif(a,b);
                     for(int i=0 ; i<c.length ; i++){
                       System.out.print(c[i] + ",");
                    }
                    System.out.print("\n");
                    getMenu();
                    break;
            case 9: System.out.println("Ate a proxima");
                    break;
            default: System.out.println("error404 Not Found");
                
        }
        }
    
    }
}
