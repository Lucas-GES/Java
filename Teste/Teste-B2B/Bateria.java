import java.util.Scanner;
public class Bateria
{
    Scanner scan = new Scanner(System.in); 
    private int n = scan.nextInt();
    int bateria = 50;
    int[] eventos = new int[n];
    public int[] getEventos()
    {      
      for(int i = 0; i < n; i++){
          eventos[i] = scan.nextInt();
      }
      return eventos;
    }
    
    public int getBattery(int[] eventos){        
        for(int i = 0; i < n; i++){            
            bateria += eventos[i];
            if(bateria > 100){
                bateria = 100;
            }
            System.out.println("Bateria atual = " + bateria);
        }
        
        return bateria;
    }
    
    public static void main(String args[]){
        Bateria bateria = new Bateria();
        int[] eventos = bateria.getEventos();
        System.out.printf("Bateria = " + bateria.getBattery(eventos));
    }
}
