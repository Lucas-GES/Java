import java.util.Scanner;
public class Paises {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Paises:");
        String p = tec.nextLine().toUpperCase();
        String p1 = p.substring(0,p.indexOf(','));
        System.out.println(p1 + " " + p1.length());
        p = p.substring(p.indexOf(',')+1);
//		System.out.println(p);
        String p2 = p.substring(0,p.indexOf(',')).trim();
        System.out.println(p2 + " " + p2.length());
        String p3 = p.substring(p.indexOf(',')+1).trim();
        System.out.println(p3 + " " + p3.length());
    }
}
