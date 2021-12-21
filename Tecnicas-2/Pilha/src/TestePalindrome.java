import java.util.Scanner;
public class TestePalindrome {
    public static void main(String args[]){
        Palindrome teste = new Palindrome();
        Scanner teclado = new Scanner(System.in);

        System.out.println("True para Palindrome");
        System.out.println("False para Palindrome" + '\n');
        System.out.println("Digite a Palavra ou frase: ");
        System.out.println(teste.isPalindrome(teclado.nextLine()));



    }
}
