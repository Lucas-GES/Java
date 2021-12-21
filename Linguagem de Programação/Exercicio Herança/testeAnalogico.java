
import java.util.Scanner;
public class testeAnalogico
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        LiquidificadorAnalogico analogico = new LiquidificadorAnalogico(5);
        
        int opcao = 0;
        
        while(opcao != 9){
           System.out.println("1-Mostrar Velocidade");
           System.out.println("2-Mostrar Velocidade Maxima");
           System.out.println("3-Incrementar Velocidade");
           System.out.println("4-Decrementar Velocidade");
           System.out.println("9-Encerrar");
           opcao = teclado.nextInt() ; teclado.nextLine();
            
           switch(opcao){
               case 1: System.out.println("Velocidade: " + analogico.getVelocidade() + '\n');
               break;
               case 2: System.out.println("Velocidade Maxima: " + analogico.getvelocidadeMaxima() + '\n');
               break;
               case 3: System.out.println("Velocidade Aumentada" + '\n');
                        analogico.aumentarVelocidade();
               break;
               case 4: System.out.println("Velocidade Diminuida" + '\n');
                        analogico.diminuirVelocidade();
               break;
               default: 
               if (opcao == 9){
                   System.out.println("Ate a Proxima!");
               }else{
               System.out.println("Opçao Incorreta");
              }
           }
        }
    }
}
