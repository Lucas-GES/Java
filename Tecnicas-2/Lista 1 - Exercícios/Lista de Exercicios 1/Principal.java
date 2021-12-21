import java.util.ArrayList;
public class Principal
{
    public static int exercicio1(int fib){
        int x = 1;
        int y = 1;
        int z = 1;        
        for(int i = 2; i < fib ; i++){
            x = z;
            z = y;
            y = y + x;            
        }
        return y;
    }
    public static int exercicio2a(int[] fib){
        int soma = 0;
        for(int i=0; i<fib.length;i++){
           soma += fib[i];
        }
        return soma;
    }
    public static int exercicio2b(int[] fib2){        
        int maior = 0;
        int segundo = 0;
        int terceiro = 0;
        for(int i=0 ; i<fib2.length ; i++){
           if(fib2[i] > maior){
            maior = fib2[i];
            }   
           for(int t=0 ; t< fib2.length ; t++){
            if(fib2[t] > segundo && fib2[t] < maior){
               segundo = fib2[t];
            }               
            }
        }
        
        for(int i=0 ; i<fib2.length ; i++){
            if(fib2[i] > terceiro && fib2[i] < segundo){
                terceiro = fib2[i];
            }
        }
        
      return terceiro + segundo;
    }
    public static String exercicio3a(String s , String c){
        s = s.substring(s.indexOf(c)+1).trim();
        String saida = s;
        return saida;
        
    }
    public static String exercicio3b(String s, String c){
        s = s.substring(s.indexOf(c)+1).trim();
        String saida = s.substring(s.indexOf(c)+1).trim();
        return saida;
        
    }
    public static String exercicio3c(String s, String c){
        s = s.substring(s.indexOf(c)+1).trim();
        String saida = s.substring(0,s.indexOf(c)).trim();
        return saida;
    }public static String exercicio3d(String s, String c){
        s = s.substring(s.indexOf(c)+1).trim();
        String saida = s.substring(s.indexOf(c)-1).trim();
        return saida;
        
    }
    public static String exercicio4a(String palavra){
        String saida ="";
        String invertida = new StringBuffer(palavra).reverse().toString();
        if(palavra.equals(invertida)){
            saida = "E Palindrome";
        }else{
            saida = "Nao e Palindrome";
        }
        return saida;
    }
    public static String exercicio4b(String palavra){
        palavra = palavra.replace(" ","");//Metodo que tira os espaços
        String saida ="";
        String invertida = new StringBuffer(palavra).reverse().toString();
        if(palavra.equals(invertida)){
            saida = "E Palindrome";
        }else{
            saida = "Nao e Palindrome";
        }
        
        return saida;
    }
    public static String exercicio5a(ArrayList<String> palavras){        
        String saida ="";
        String reverse ="";
        
        for(int i=0; i<palavras.size();i++){
            reverse = new StringBuffer(palavras.get(i)).reverse().toString();
            if(palavras.get(i).equals(reverse)){
            saida = saida + palavras.get(i) + " ";
            }
        }
        
        return saida;
    } 
    public static String exercicio5b(){            
        String saida ="";
        String reverse ="";
        String number="";
        
        for(int i=0; i<=10000; i++){
          number = new Integer(i).toString();
            if(i % 2 == 0 ){
            reverse = new StringBuffer(number).reverse().toString();
            if(number.equals(reverse)){
              saida +=" " +i + '\n';    
            }
          }
        }
        
        return saida;
    }
  
    public static void main(String args[]){
       
       //Exercicio 1
       System.out.println("Exercicio 1 resultado fibonacci = " + exercicio1(15) +'\n');
       
       //Exercicio 2 a
       int[]  array = {1, 2, 3, 4, 5};
       System.out.println("Exercicio 2a resultado = " + exercicio2a(array) + '\n'); 
       
       // Exercicio 2 b
       
       System.out.println("Exercicio 2b resultado: " + exercicio2b(array)+'\n');
       
       //Exercicio 3 a
       
       System.out.println("Exercicio 3a resultado: " + exercicio3a("Ola, mundo,cruel!" , ",") +'\n');
       
       //Exercicio 3 b 
       System.out.println("Exercicio 3b resultado: " + exercicio3b("Ola, mundo,cruel!" , ",") +'\n');
       
       //Exercicio 3 c 
       System.out.println("Exercicio 3c resultado: " + exercicio3c("Ola, mundo, cruel!" , ",") +'\n');
       
       //Exercicio 3 d
       System.out.println("Exercicio 3d resultado: " + exercicio3d("Ola, mundo, cruel!" , ",") +'\n');
       
       //Exercicio 4 a
       System.out.println("Exercicio 4a resposta: " + exercicio4a("ACUCAR") + '\n');
       
       //Exercicio 4 b
       System.out.println("Exercicio 4b resposta: " + exercicio4b("ROMA ME TEM AMOR") + '\n');
       
       //Exercicio 5 a
       
       ArrayList<String> lista = new ArrayList();
       lista.add("ana");
       lista.add("banana");
       lista.add("ovo");
       lista.add("joao");
       
       System.out.println("Exercicio 5a resposta: " + exercicio5a(lista) + '\n');
       
       //Exercicio 5 b
       
       System.out.println("Exercicio 5b resposta: " + exercicio5b());
    } 
}
