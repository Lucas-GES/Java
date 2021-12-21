 
/**
 * Escreva a descrição da classe UsaCartao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class UsaCartao
{
    public static void main(String args[]){
        CartaoCredito cartao = new CartaoCredito(666666666 ,"Master Card");
        Scanner teclado = new Scanner(System.in);
            
        int menu = 0 ;                          
                  
        cartao.getMenu();                
        while(menu != 9){            
            menu = teclado.nextInt();
            teclado.nextLine();           
            switch(menu){
             case 1: System.out.println("Digite o nome da bandeira do cartão: ");
             cartao.setBandeira(teclado.nextLine());
             System.out.println("");
             cartao.getMenu();
             break;
             
             case 2: System.out.println("Digite o limite do seu cartão: ");
             cartao.setLimite(teclado.nextFloat());
             System.out.println("");
             cartao.getMenu();
             break;
             
             case 3: System.out.println("Digite o valor da compra: ");
             cartao.addComprar(teclado.nextFloat());
             System.out.println("");
             cartao.getMenu();
             break;
             
             case 4: System.out.println("Digite o quanto vai pagar da compra: ");
             cartao.addPagar(teclado.nextFloat());
             System.out.println("");
             cartao.getMenu();
             break;
             
             case 5: System.out.println("Numero do Cartão: " + cartao.getNumero());
                     System.out.println("Nome da Bandeira: " + cartao.getBandeira());
                     System.out.println("Bônus do Cartão: " + cartao.getBonus());
                     System.out.println("Limite do Cartão: " + cartao.getLimite());
                     System.out.println("Saldo do Cartão: " + cartao.getSaldo());
                     
                     System.out.println("");
                     cartao.getMenu();
             break;
             
             case 9: System.out.println("Até a Proxima!!!");
             break;
             
             default :System.out.println("Error404");             
             System.out.println("");
             cartao.getMenu();
             break;
            }
        }
    }
}
