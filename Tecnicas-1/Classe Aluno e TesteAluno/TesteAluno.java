public class TesteAluno
{
    public static void main(String args[])
    {
        //classe  obj  = new construtor;
        Aluno aluno1 = new Aluno(10,"Seu nome");
        
        aluno1.setPeso(10);//chamada de método
        aluno1.setAltura(1.7);
        System.out.println(aluno1.getImc());
    }
}
