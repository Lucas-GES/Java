import java.util.Scanner;
public class Teste
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        Equipe equipe = new Equipe("LEC");
        int opcao=0;
        while(opcao != 9)
        {
            System.out.println("1-Inclui jogador");
            System.out.println("2-Lista jogadores");
            System.out.println("3-Exclui jogador");
            System.out.println("9-Fim");
            opcao = teclado.nextInt(); teclado.nextLine();
            String nome, posicao;
            Jogador jogador;
            switch(opcao){
                case 1 : System.out.println("Nome");
                         nome = teclado.nextLine();
                         System.out.println("Posição");
                         posicao = teclado.nextLine();
                         equipe.addJogador(new Jogador(nome,posicao));
                         break;
                case 2 : System.out.println(equipe.getListaJog());
                         break;
                case 3 : System.out.println("Nome");
                         nome = teclado.nextLine();
                         jogador = equipe.getJogador(nome);
                         if (jogador != null){
                             equipe.removeJogador(jogador);
                         }else{
                             System.out.println("Jogador não cadastrado!");
                         }
                         break;
            }
        }
    }
}
