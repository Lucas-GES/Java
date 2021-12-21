public class Funcao {
    public static int pontoEVirgula (String s)
    {
        int i, qt=0;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '.' ||s.charAt(i) == ',')
                qt++;
        }
        return qt;
    }

    public static String parseNome(String nome){
        String nome2 = "";
        int posic;
        posic = nome.indexOf(',');
        if (posic >= 0){
            nome2 = nome.substring(posic+1)+' '+ nome.substring(0,posic);
        }
        return nome2.toUpperCase();
    }

    public static String obterSenhaInicial(String nome, String sobrenome){
        String s1, s2;
        while (nome.length() < 3){
            nome = nome + ((int)(Math.random() * 10));
        }
        s1 = nome.substring(0,3);

        while (sobrenome.length() < 3){
            sobrenome = sobrenome + ((int)(Math.random() * 10));
        }
        s2 = sobrenome.substring(sobrenome.length() - 3);
        return s1+s2;

    }

}
