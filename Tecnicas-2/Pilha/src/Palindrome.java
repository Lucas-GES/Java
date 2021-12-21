public class Palindrome {
    Pilha<Character> pl = new Pilha<Character>(100);

    public boolean isPalindrome(String p){
        String entrada = p.toLowerCase().replace(" ","");
        String aux ="";

        boolean saida;

        for(int i=0; i < entrada.length(); i++){
            //if(p.charAt(i) != (' ')){
                pl.insert(entrada.charAt(i));
           // }
        }

        for(int i=0; i < entrada.length(); i++){
            aux += pl.remove();
        }

        if(entrada.equals(aux)){
            saida = true;
        }else{
           saida = false;
        }
        return saida;
    }
}
