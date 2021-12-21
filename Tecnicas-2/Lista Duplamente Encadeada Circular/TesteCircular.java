import java.util.Scanner;

public class TesteCircular {
    public static void main(String[] args){
        ListaDuplaCircular lista = new ListaDuplaCircular();
        int  op=0, valor;
        Scanner teclado = new Scanner(System.in);


        while(op != 9){
            System.out.println("1-Inserir");
            System.out.println("2-Remover");
            System.out.println("3-Listar");
            System.out.println("4-Mostrar");
            System.out.println("9-Fim");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    System.out.println("Novo Valor: ");
                    valor = teclado.nextInt();
                    lista.adicionar(valor);
                    break;

                case 2:
                    try {
                        System.out.println("Retirar o Valor: ");
                        valor = teclado.nextInt();
                        lista.remover(valor);
                    }catch (ListaVaziaException e){
                        System.out.println("Lista Vazia");
                    }
                    break;

                case 3:
                    System.out.println(lista);
                    break;

                case 4: lista.mostrar();
                    break;
            }
        }
    }
}
