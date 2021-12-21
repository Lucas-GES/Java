
/**
 * Escreva a descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Aluno
{
    // variáveis de instância
    // atributos
    private int matricula;
    private String nome;
    private String endereco;
    private double peso;
    private double altura;

    /**
     * COnstrutor para objetos da classe Aluno
     */
    public Aluno(int matricula, String nome)
    {
        // inicializa variáveis de instância
        this.nome = nome; //atribui o parametro nome para o atributo
        this.matricula = matricula;
    }
    
    //método modificador
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    
    //método acessor
    //retorna o resultado do imc
    public double getImc()
    {
        return peso / (altura * altura);
    }
}
