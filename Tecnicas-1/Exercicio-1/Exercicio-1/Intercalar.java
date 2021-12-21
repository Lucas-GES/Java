
public class Intercalar
{
    private static int[] A = new int[]{23,14,28,7,32};
    private static int[] B = new int[]{4,22,13,16,27};
    private static int[] C = new int[10];
    
    public static String Intercalar()
    {               
        int aux = 0;
        for(int i = 0; i < A.length; i++){
            C[aux] = A[i];
            aux++;
            C[aux] = B[i];
            aux++;
        }        
        String result = "";
        for(int k = 0; k < C.length; k++){
            result += C[k] + ",";
        }        
        return result;
    }
    
    public static int somaPar(){
        int result = 0;        
        for(int i = 0; i < C.length; i++){            
            if(C[i] % 2 == 0){
                System.out.println("N°: " + C[i] + ",");
                result += C[i];
            }
        }
        
        return result;
    }
    
    public static int somaImpar(){
        int result = 0;
        for(int i = 0; i < C.length; i++){
            if(C[i] % 2 == 1){
                System.out.println("N°: " + C[i] + ",");
                result += C[i];
            }
        }
        
        return result;
    }
    
    public static void main(String args[]){
        
        System.out.println("Array C intercalado: " + Intercalar());
        System.out.println("Total de Numeros Pares: " + somaPar());
        System.out.println("Total de Numeros Impaes: " + somaImpar());
    }

}
