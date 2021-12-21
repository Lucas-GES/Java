import java.util.Scanner;
public class Delimitadores{
    Scanner teclado = new Scanner(System.in);
    Pilha p = new Pilha(teclado.nextInt());

    public String setDelimita(String s)throws PilhaVaziaException{
        String saida ="";
        int open = 0;
        int closed = 0;

        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == '{'){
                p.insert(s.charAt(i));
                open++;

            }else if(s.charAt(i) == '['){
                p.insert(s.charAt(i));
                open++;

            }else if(s.charAt(i) == '(') {
                p.insert(s.charAt(i));
                open++;
                
            }if(s.charAt(i) ==')'){
                if(p.isEmpty()){
                    return saida = "Incorreto";
                }
                p.remove();
                closed++;
                System.out.println("Fechou ()");
            }else if(s.charAt(i) ==']'){
                if(p.isEmpty()){
                    return saida = "Incorreto";
                }
                p.remove();
                closed++;
                System.out.println("Fechou []");
            }else if(s.charAt(i) =='}'){
                if(p.isEmpty()){
                    return saida = "Incorreto";
                }
                p.remove();
                closed++;
                System.out.println("Fechou {}");
            }


        }
        if(open == closed){
            saida = "Correto";
        }else if(open != closed){
            saida = "Incorreto";
        }

        return saida;
    }

}
