import java.util.Scanner;
public class ControlarSenha {
    public static void main(String args[]){
        Fila<String> fila = new Fila<>(100);
        Fila<String> prioritaria = new Fila<>(100);
        Scanner teclado = new Scanner(System.in);
        int opcao = 0 , numero=0, numeroP=0, count=0;
        while(opcao != 9){
            System.out.println("1-Retirar Senha");
            System.out.println("2-Retirar Senha Prioritaria");
            System.out.println("3- Chamar Senha");
            System.out.println("9 - Fim");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    numero++;
                    fila.insert("NOR-" +numero);
                    System.out.println("Senha Gerada: NOR-"+numero);
                    break;

                case 2:
                    numeroP++;
                    prioritaria.insert("PRIOR-" +numeroP);
                    System.out.println("Senha Gerada: PRIOR-"+numeroP);
                    break;

                case 3:
                    try {
                        if (count == 2 ) {
                            System.out.println("Senha Chamada: " + fila.remove());
                            count = 0;
                        }else if(prioritaria.front() == null && fila.front() != null ){
                            System.out.println("Senha Chamada: " + fila.remove());
                            count = 0;
                        }else if(fila.front() == null && prioritaria.front() != null) {
                            System.out.println("Senha Chamada: " + prioritaria.remove());
                            count = 0;
                        }else if(fila.front() == null && prioritaria.front() == null){
                            System.out.println("Ambas Vazias");
                        }else{
                            System.out.println("Senha Chamada: " + prioritaria.remove());
                            count++;
                        }
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
