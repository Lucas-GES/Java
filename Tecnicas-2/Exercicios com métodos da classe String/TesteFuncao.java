public class TesteFuncao {
    public static void main(String[] args) {
        System.out.println(Funcao.pontoEVirgula("Paraná, Santa Catarina e Rio Grande do Sul são da região sul."));
        System.out.println(Funcao.parseNome("Kaneshima,Edson Shinki"));
        System.out.println(Funcao.obterSenhaInicial("e","k"));

        for(int i=0; i<10;i++){
            System.out.println((int)(Math.random() * 10));
        }
    }
}
