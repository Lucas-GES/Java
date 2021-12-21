import java.util.Scanner;
import java.util.InputMismatchException;
public class UsaArrayInt
{
    private Scanner teclado;
    
    public UsaArrayInt()
    {
        teclado = new Scanner(System.in);
    }
    
    public void carregaArray(int arr[]) throws InputMismatchException
    {
        for(int i=0; i<arr.length; i++){
            System.out.println("Informe Numero: ");
            arr[i] = teclado.nextInt();
        }
    }
    
    //Retorne uma String contendo os números armazenados no array separados por virgula
    //Exemplo: 20, 1, 3, 5, 3
    public String mostraArray(int arr[]){        
        String saida = "Numeros: ";
        for(int i=0 ; i < arr.length; i++){
            saida = saida + arr[i] + ",";
        }
        return saida;
    }
    
    //Retorne o número armazenado no array conforme o índice informado no parâmetro
    //Faça o tratamento de exceção throws
    public int mostraArray(int arr[], int indice) throws ArrayIndexOutOfBoundsException{
        return arr[indice];
    }
    
    //Retorne um array contendo o resultado da divisão do arrA pelo arrB
    //Faça o tratamento de exceção throws
        public int[] geraArrayDivisao(int arrA[],
                                  int arrB[])throws ArithmeticException{
       int saida[] = new int[arrA.length];       
       for(int i=0; i < arrA.length; i++){
        saida[i] = arrA[i]/arrB[i];
       }
       return saida;
    }
    
    //Retorne um array contendo os números comuns que existem no arrA e arrB.
    //Numero repetido carregar apenas uma vez
    //Exemplo: arrA = {20, 1, 3, 5, 3} e arrB = {2, 3, 4, 5, 6} 
    //Retornar: {3, 5, 0, 0, 0}
    public int[] geraArrayInter(int arrA[],int arrB[]){
      int saida[] = new int[arrA.length];
      int k = 0;
      for(int i=0; i< arrA.length; i++){
          for(int j=0; j<arrB.length; j++){
          if(arrA[i] == arrB[j]){
              saida[k] = arrA[i];
              k++;
          }
          }          
      }
      
      for(int i=0; i<saida.length;i++){
          for(int j= i+1; j<saida.length;j++){
          if(saida[i] == saida[j]){
            saida[j] = 0;            
            }
        }
       }
      return saida;
    }
    
    //Retorne um array contendo os números do arrA que não existam no arrB.
    //Numero repetido carregar apenas uma vez
    //Exemplo: arrA = {20, 1, 3, 5, 11} e arrB = {2, 3, 4, 5, 6} 
    //Retornar: {20, 1, 11, 0, 0}
    public int[] geraArrayDif(int arrA[],int arrB[]){
        int saida[] = new int[arrA.length];
        int k = 0;
        int count = 0;
      for(int i=0; i< arrA.length; i++){
          count = 0;
          for(int j=0; j<arrB.length; j++){
          if(arrA[i] != arrB[j]){
            count++;
              if(count == arrA.length){
              saida[k] = arrA[i];   
              k++;
          }
          }
          
        }
          }        
      
      return saida;
      }
      
    
}