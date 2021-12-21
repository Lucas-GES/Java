public class Teste {
    public static void main(String args[]) {
        int auxiliar[] = {9,3,2,222,364,0,1,7,3};
        String desordenado = "";
        for(int i=0; i<auxiliar.length ; i++){
            desordenado += auxiliar[i] + "," + "";
        }
        System.out.println("Array desordenado: " + desordenado);

        Util.ordena(auxiliar);
    }
}
