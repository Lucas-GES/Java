import java.util.Scanner;
import java.util.InputMismatchException;
public class Matriz
{
    private Scanner teclado;
    

    public Matriz()
    {
        teclado = new Scanner(System.in);
    }

    public void carrega(int m[][])
    {
        try {
            for(int i = 0; i < m.length; i ++) {
                for(int j = 0; j < m[i].length; j++) {
                    System.out.print("Elemento[" + (i+1) + "][" + (j+1) + "]: " );
                    m[i][j] = teclado.nextInt();
                }
            }
        }catch(InputMismatchException e) {
            System.out.println("Valor inserido invalido");
        }
    }
    
    public void mostra(int m[][])
    {
         
        for(int i = 0; i < m.length; i ++) {
            for(int j = 0; j < m[i].length; j++) {
                if(j == m.length - 1) {
                    System.out.print(m[i][j] + "\n");
                }else {
                    System.out.print(m[i][j] + " , ");
                }
            }
        }
        System.out.println("\n");
    }
    
    public int[][] soma(int m[][], int m2[][])
    {
        int [][]result = new int[m.length][m.length];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                result[i][j] = (m[i][j] + m2[i][j]);
            }
        }
        return result; 
    }
    
    public int[][] transpor(int m[][])
    {
        int [][]result = new int[m.length][m.length];
        
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                result[i][j] = m[j][i];
            }
        }
        return result;
    }
    
    public boolean quadradoMagico(int m[][])
    {
        boolean result = false;
        int [] somaLin = new int [m.length];
        int somaLinha = 0;
        int [] somaCol = new int[m.length];
        int somaColuna = 0;
        for(int i = 0; i < m.length; i++) {
            somaLinha = 0;
            somaColuna = 0;
            for(int j = 0; j < m[i].length; j++) {
                somaLinha += m[i][j];
                somaLin[i] = somaLinha;                
                somaColuna += m[j][i];
                somaCol[i] = somaColuna;                
            }
        }
       
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;       
        for(int i = 0; i < m.length; i++) {
            diagonalPrincipal += m[i][i];
        }
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if(i + j == m.length - 1) {
                    diagonalSecundaria += m[i][j];
                }
            }
        }
        boolean eMagico = false;
        for(int i = 0; i < somaLin.length; i++) {
            if(somaLin[i] == somaCol[i] && somaLin[i] == diagonalPrincipal && diagonalSecundaria == somaCol[i]) {
                eMagico = true;
            }
        }
        if(eMagico) {
            result = true;
            System.out.println(" Sim");
        }else {
            System.out.println(" Nao");
        }
        return result;
        
    }
    
    
}