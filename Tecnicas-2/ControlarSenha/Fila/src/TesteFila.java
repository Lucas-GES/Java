import java.util.Scanner;

public class TesteFila {
    public static void getMenu(){
        System.out.println("Case 1: Adicionar Valor a Fila: ");
        System.out.println("Case 2: Remover valor");
        System.out.println("Case 3: Exibir o primeiro elemento ");
        System.out.println("Case 4: Exibir a quantidade de itens");
        System.out.println("Case 9: Encerrar");
    }
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Fila<Integer> fila = new Fila<Integer>(100);
        int opcao = 0;

        getMenu();

        while(opcao != 9){
            opcao = teclado.nextInt(); teclado.nextLine();
            switch (opcao){
                case 1: System.out.println("Digite o valor: ");
                        fila.insert(teclado.nextInt());
                        getMenu();
                        break;

                case 2: System.out.println("Valor Removido da Fila");
                        fila.remove();
                        getMenu();
                        break;

                case 3: System.out.println("O primeiro valor da fila é: ");
                        System.out.println(fila.front());
                        getMenu();
                        break;

                case 4: System.out.println("Quantidade de itens: ");
                        System.out.println(fila.size());
                        getMenu();
                        break;

                default: if(opcao > 9){
                    System.out.println("Erro");
                }
                    getMenu();
                    break;
            }
        }

    }
}
