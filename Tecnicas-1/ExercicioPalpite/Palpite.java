
/**
 * Escreva a descrição da classe Palpite aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Palpite
{
  public static void main(String args[]){
      Scanner teclado = new Scanner(System.in);
      int palpite = 0;
      int Palmeiras = 0;
      int Barcelona = 0;
      int Empate = 0;
      int Sair = 0;
      
      System.out.println("De o seu palpite do Jogo Palmeiras x Barcelona");
      System.out.println("1 : Palmeiras ");
      System.out.println("2 : Barcelona ");
      System.out.println("3 : Empate ");
      System.out.println("9 : Sair ");
      while(Sair != 9){
        System.out.println("Qual o Seu Palpite ? ");
        palpite = teclado.nextInt();
         switch(palpite){
             case 1 : Palmeiras += 1;
             break;
             case 2 : Barcelona += 1;
             break;
             case 3 : Empate += 1;
             break;
             case 9 : Sair = 9 ; 
             break;
             default : System.out.println("Voto Inválido");
     }
    }
        System.out.println("Votos para Palmeiras: " + Palmeiras);
        System.out.println("Votos para Barcelona: " + Barcelona);
        System.out.println("Votos para Empate: " + Empate);
        System.out.println("Total de Votos: "+ (Palmeiras + Barcelona + Empate));
        
    
   }
}