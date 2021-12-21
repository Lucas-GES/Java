import java.util.Scanner;
public class MatrizExemplo
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        int a[][] = new int[4][4];
        //entrada de dados
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++){
                System.out.println("Linha " + (i+1) +
                   " Coluna " + (j+1) + ": ");
                a[i][j] = teclado.nextInt();   
            }
        }
        //mostre os numeros armazenados
        int soma = 0;
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++){
                System.out.println("Linha " + (i+1) +
                   " Coluna " + (j+1) + ": " + a[i][j]);   
                soma += a[i][j];
            }
        }
        //mostre a soma da 2a coluna
        int somaAux = 0;
        for(int i=0; i<a.length; i++){
            somaAux += a[i][1];
        }
        System.out.println(somaAux);
        
        //mostre a soma da 3a linha
        somaAux = 0;
        for(int i=0; i<a[i].length; i++){
            somaAux += a[2][i];
        }
        System.out.println(somaAux);
            
        //mostre a soma de todos os numeros armazenados
        System.out.println("Soma: " + soma);
        int media = soma / 16;
        System.out.println("Media: " + media);
        //mostre os numeros maiores que a média
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++){
                if (a[i][j] > media){
                   System.out.println("Linha " + (i+1) +
                   " Coluna " + (j+1) + ": " + a[i][j]);

                }
            }
        }
        
        soma = 0;
        for(int i=0; i<a.length; i++){
            soma += a[i][i];
        }
        System.out.println("Soma da diagonal principal " + soma);
        
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[i].length; j++){
                if (a[i][j] % 2 == 0){
                   a[i][j] = a[i][j] * 2;
                }
            }
        }
    }
}
