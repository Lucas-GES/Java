public class Util {

    public static void ordena(int v[]){
        String ordena = "";
        for(int i=0; i<v.length;i++){
            int maior=0;
            for(int t=0; t<v.length; t++){
                if(v[i] < v[t]){
                    maior = v[i];
                    v[i] = v[t];
                    v[t] = maior;
                }
            }
        }

        for(int i=0; i<v.length ; i++){
            ordena += v[i] + "," + "";
        }
        System.out.println("Array ordenado: " + ordena);
    }
}
