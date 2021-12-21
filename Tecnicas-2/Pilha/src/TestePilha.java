import java.util.Scanner;
public class TestePilha {
    public static void getMenu(){
        System.out.println("Case 1: Empilhar Valor ");
        System.out.println("Case 2: Desempilhar valor");
        System.out.println("Case 3: Mostrar Topo ");
        System.out.println("Case 4: Tamanho da Pilha");
        System.out.println("Case 5: Delimitadores");
        System.out.println("Case 9: Encerrar");
    }
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        System.out.println("Digite o tamanho da Pilha: ");
        Pilha p = new Pilha(teclado.nextInt());
        Delimitadores d = new Delimitadores();
        getMenu();

        while(menu != 9){
            menu = teclado.nextInt();teclado.nextLine();
            switch(menu){
                case 1: System.out.println("Digite o valor para empilhar: ");
                        p.insert(teclado.nextInt());
                        getMenu();
                        break;
                case 2: System.out.println("Desempilhando");
                        p.remove();
                        getMenu();
                        break;
                case 3: System.out.println("Esta no topo: ");
                        System.out.println(p.getTopo());
                        getMenu();
                        break;
                case 4: System.out.println("Tamanho da Pilha: ");
                        System.out.println(p.size());
                        getMenu();
                        break;

                case 5: String test = "if(a > b) { c (1 )} = 5;";
                        System.out.println("A sentença "+ test + "está: ");
                        System.out.println(d.setDelimita(test));
                        break;

                default: if(menu > 9){
                    System.out.println("Erro");
                }
                getMenu();
                break;

            }
        }
    }


}
