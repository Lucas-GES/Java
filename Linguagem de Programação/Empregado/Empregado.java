
/**
 * Escreva a descrição da classe Empregado aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Empregado
{
    private int id;
    private static int proximoId = 1;
    private String nome;
    private double salario;
    
    public Empregado(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
   
    public Empregado()
    {
        // inicializa variáveis de instância
        setId();
    }

    public void setId()
    {
        id = proximoId;
        proximoId++;
    }
    
    public static int getProximoId()
    {
        return proximoId;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public double getSalario()
    {
        return this.salario;
    }
    
    public void setNome(String nome)
    {
        if(!nome.trim().equals("")){
            this.nome = nome.trim();
        }else{
            System.out.println("Incorreto");
        }
    }
    
    public void setSalario(double salario)
    {
        if(salario > 0 ){
            this.salario = salario;
       }
    }
}
