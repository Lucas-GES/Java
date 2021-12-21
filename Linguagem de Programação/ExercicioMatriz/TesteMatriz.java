import java.util.Scanner;
public class TesteMatriz {
    public static void main(String[] args) {        
        int [][] result = new int [3][3];
        Scanner teclado = new Scanner(System.in);
        Matriz matriz = new Matriz();
        int menu = 0;
        
        int [][] m1 = new int[3][3];
        int [][] m2 = new int[3][3]; 
        
        while(menu != 9) {
            getMenu();
            menu = teclado.nextInt();
            switch(menu) {
                case 1:
                   System.out.println("Digitar Matriz 1: ");
                   matriz.carrega(m1);
                   System.out.println("Digitar Matriz 2: ");
                   matriz.carrega(m2);
                   break;
                case 2:
                    System.out.println("Matriz 1:");
                    matriz.mostra(m1);
                    System.out.println("Matriz 2: ");
                    matriz.mostra(m2);
                    break;
                case 3:
                    System.out.println("Soma das Matrizes 1 e 2: ");
                    result = matriz.soma(m1,m2);
                    matriz.mostra(result);
                    break;
                case 4:
                    System.out.println("Matriz Transposta 1 e 2: ");
                    result = matriz.transpor(m1);
                    matriz.mostra(result);
                    result = matriz.transpor(m2);
                    matriz.mostra(m2);
                    break;
                case 5:
                    System.out.println("Quadrado magico?");
                    System.out.print("Matriz 1: ");
                    matriz.quadradoMagico(m1);
                    System.out.print("Matriz 2: ");
                    matriz.quadradoMagico(m2);
                    break;
                case 9: System.out.println("Ate a Proxima!!!");
                
                default:
                    System.out.println("Opçao invalida!");
                    getMenu();
                    break;
            }
        }
    }
    static void getMenu() {
        System.out.println("[Menu]");
        System.out.println("[1] - Carregar matrizes");
        System.out.println("[2] - Mostrar matrizes");
        System.out.println("[3] - Somar matrizes");
        System.out.println("[4] - Transpor matrizes");
        System.out.println("[5] - Verificar quadrado magico");
    }
}