
/**
 * Escreva a descrição da classe ArrayInt aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class ArrayInt
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x[];
    private Scanner teclado;

    /**
     * COnstrutor para objetos da classe ArrayInt
     */
    public ArrayInt(int tamanho)
    {
        // inicializa variáveis de instância
        x = new int[tamanho] ;
        teclado = new Scanner(System.in);
    }

    public void addArray()
    {
        for(int i=0 ; i < x.length; i++){
            System.out.println("Elemento " + (i+1));
            x[i] = teclado.nextInt();
        }
    }
    
    public String getArray(){
        String saida = "Elementos: ";
        for(int i=0 ; i < x.length; i++){
           saida = saida + x[i] + " ";
        }
        return saida;
    }
    
    public void setElemento(int indice , int valor)
    {           
        x[indice] = valor;         
    }
    
    public void setOrdenar()
    {       
        for(int i=0 ; i < x.length; i++){ 
            int maior=0;
            for(int t=0 ; t < x.length; t++){
                if (x[i] < x[t]  ){
                  maior = x[i];
                  x[i] = x[t];
                  x[t] = maior;                                   
                }         
            }
        }
    }
}
