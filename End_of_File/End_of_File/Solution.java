import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution
{
    private static int length = 0;
    private static String[] words = new String[1]; 
    
    public static void newVector(){
        if(length == words.length){
            String[] aux = new String[words.length + 1];
            System.arraycopy(words, 0, aux, 0, length);
            words = aux;
        }        
    }
        
    public static void main(String[] args) {        
        
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < words.length; i++){            
            try{
            words[i] = scan.nextLine();
            if(words[i].equals("exit")){
                break;
            }
            System.out.println((i+1) + " " + words[i]);
            
            length++;
            newVector();
            }catch(NoSuchElementException e){
                break;
            }
        }       
        
    }
}
