import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class TestePessoa {

    public static void main(String args[]){
        Queue<Pessoa> pessoa = new PriorityQueue<Pessoa>();
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 9){
            System.out.println("1-Adicionar nova Pessoa");
            System.out.println("2-Mostrar Pessoas por Idade");
            System.out.println("9-Encerrar");

            opcao = teclado.nextInt(); teclado.nextLine();
            switch (opcao){
                case 1: System.out.println("Digite o nome e a Idade da Pessoa: ");
                        pessoa.add(new Pessoa(teclado.nextLine() , teclado.nextInt()));
                        break;

                case 2: while (!pessoa.isEmpty()){
                    System.out.println(pessoa.remove().getNome());
                }


                default:
                    if (opcao > 9) {
                        System.out.println("Error404");
                    }
            }
        }


    }
}
