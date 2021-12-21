import java.util.Scanner;
public class ControlarSenha {
    public static void main(String args[]){
        Fila<String> fila = new Fila<>(100);
        Scanner teclado = new Scanner(System.in);
        int opcao = 0 , numero=0;
        while(opcao != 9){
            System.out.println("1-Retirar Senha");
            System.out.println("2- Chamar Senha");
            System.out.println("9 - Fim");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    numero++;
                    fila.insert("NOR-" +numero);
                    System.out.println("Senha Gerada: NOR-"+numero);
                    break;

                case 2:
                    try {
                        System.out.println("Senha Chamada: " + fila.remove());
                    }catch (FilaVaziaException s){
                       System.out.println("Fila Vazia");
                    }
                    break;

                case 9: System.out.println("Até Logo!");
                    break;

                default: System.out.println("Error404");
                    break;
            }
        }
    }
}
