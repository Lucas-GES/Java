import java.util.Scanner;
public class TesteListaSimples {
    public static void main(String[] args){
        ListaSimples lista = new ListaSimples();
        int  op=0, valor;
        Scanner teclado = new Scanner(System.in);


        while(op != 9){
            System.out.println("1-Inserir");
            System.out.println("2-Remover");
            System.out.println("3-Listar");
            System.out.println("4-Pegar Posição");
            System.out.println("9-Fim");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    System.out.println("Novo Valor: ");
                    valor = teclado.nextInt();
                    lista.adicionar(valor);
                    break;

                case 2:
                    try{
                    System.out.println("Retirar o Valor: ");
                    valor = teclado.nextInt();
                    lista.remover(valor);
                    }catch (ListaVaziaException e){
                        System.out.println("Lista Vazia");
                    }
                    break;

                case 3:
                    try {
                        System.out.println(lista);
                    }catch (ListaVaziaException e){
                        System.out.println("Lista Vazia");
                    }
                    break;

                case 4:
                        System.out.println("Digite a posição: ");
                        System.out.println(lista.getPosicao(teclado.nextInt()));
                        break;
            }
        }
    }
}
