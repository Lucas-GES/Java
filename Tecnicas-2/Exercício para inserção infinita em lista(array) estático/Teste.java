import java.util.Scanner;
public class Teste {
    public static void getMenu(){
        System.out.println("0 - inserir elemento no array");
        System.out.println("1 - inserir valor no elemento indicado");
        System.out.println("2 - retornar valor indicado ");
        System.out.println("3 - retorna valor do primeiro elemento != null");
        System.out.println("4 - retorna ultimo valor != null ");
        System.out.println("5 - remove valor armazenado no index indicado");
        System.out.println("6 - remove ultimo elemento armazenado ");
        System.out.println("7 - retorna tamanho do vetor");
        System.out.println("8 - retorna quantidade de elementos");
        System.out.println("9 - verifica se existe o elemento no vetor");
        System.out.println("10 - Converte em String");
        System.out.println("11 - Encerrar ");
    }
    public static void main(String args[]){        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Tamanho do Vetor: ");
        Vector vec = new Vector(teclado.nextInt());
        int menu = 0;
        int element = 0 , index = 0;
        getMenu();

        while(menu != 11){
            menu = teclado.nextInt();teclado.nextLine();
            switch(menu){
                case 0 : System.out.println("Digite o elemento: ");
                         element = teclado.nextInt();
                         System.out.println(vec.insert(element));
                         vec.newVector();
                         getMenu();
                         break;

                case 1 : System.out.println("Digite o indice e depois o valor : ");
                         index = teclado.nextInt();
                         element = teclado.nextInt();
                         System.out.println(vec.insertInto(element , index));
                         getMenu();
                         break;

                case 2 : System.out.println("Digite o index para procura: ");
                        index = teclado.nextInt();
                        System.out.println(vec.get(index));
                        getMenu();
                        break;

                case 3 : System.out.println(vec.first());
                         getMenu();
                         break;

                case 4 : System.out.println(vec.last());
                         getMenu();
                         break;

                case 5 : System.out.println("Digite o valor do index para remoção: ");
                         index = teclado.nextInt();
                         System.out.println(vec.remove(index));
                         getMenu();
                         break;

                case 6 : System.out.println(vec.remove());
                         getMenu();
                         break;

                case 7 : System.out.println(vec.length());
                         getMenu();
                         break;

                case 8 : System.out.println(vec.size());
                         getMenu();
                         break;

                case 9 : System.out.println("Digite o elemento para procura: ");
                         element = teclado.nextInt();
                         System.out.println(vec.exist(element));
                         getMenu();
                         break;

                case 10 : System.out.println(vec.toString());
                          getMenu();
                          break;

                default: if(menu == 11){
                    System.out.println("Ate logo");
                }else{
                    System.out.println("error404");
                    getMenu();
                }
            }
        }

    }
}
