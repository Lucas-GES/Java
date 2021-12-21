
import java.util.Scanner;
public class testeDigital
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        LiquidificadorDigital digital = new LiquidificadorDigital(23);
        
        int opcao = 0;
        
        while(opcao != 9){
           System.out.println("1-Mostrar Velocidade");
           System.out.println("2-Mostrar Velocidade Maxima");
           System.out.println("3-Trocar Velocidade");
           System.out.println("9-Encerrar");
           opcao = teclado.nextInt() ; teclado.nextLine();
            
           switch(opcao){
               case 1: System.out.println("Velocidade: " + digital.getVelocidade() + '\n');
               break;
               case 2: System.out.println("Velocidade Maxima: " + digital.getvelocidadeMaxima() + '\n');
               break;
               case 3: System.out.println("Digite a nova Velocidade: ");
                        digital.trocarVelocidade(teclado.nextInt());
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
