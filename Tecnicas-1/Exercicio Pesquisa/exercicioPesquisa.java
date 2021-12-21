
/**
 * Escreva a descrição da classe exercicioPesquisa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class exercicioPesquisa
{
    public static void main(String args[]){
        
        int pesquisa[] = new int[20];
        
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
                
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua nota para a comida da cantina: ");
        for (int i=0 ; i < pesquisa.length ; i++){
            System.out.println("Dê sua nota de 1 a 5: ");
            pesquisa[i]= teclado.nextInt();
            if (pesquisa[i] == 1) {
                v1 += + 1;
            }else if (pesquisa[i] == 2){
                v2 += + 1;
            }else if (pesquisa[i] == 3){
                v3 += + 1;
            }else if (pesquisa[i] == 4){
                v4 += + 1;
            }else if (pesquisa[i] == 5){
                v5 += + 1;
            }else{
                System.out.println("Voto inválido");
                i--;
            }
            
        }
        System.out.println("Avaliação de nota 1 foram de : " + v1 +" alunos");
        System.out.println("Avaliação de nota 2 foram de : " + v2 +" alunos");
        System.out.println("Avaliação de nota 3 foram de : " + v3 +" alunos");
        System.out.println("Avaliação de nota 4 foram de : " + v4 +" alunos");
        System.out.println("Avaliação de nota 5 foram de : " + v5 +" alunos");
    }
}
