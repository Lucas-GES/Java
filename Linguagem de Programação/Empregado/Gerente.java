
/**
 * Escreva a descrição da classe Gerente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Gerente extends Empregado
{
    private double bonus;
           
    public Gerente(String nome, double salario, double bonus){
            super(nome,salario);
            this.bonus = bonus;
    }
    public double getBonus(){
        return this.bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    public double getSalario(){
        return super.getSalario() + bonus;
    }
      
    public void getMenu(){
          System.out.println("--------------------------------------------");
          System.out.println("Digite 1 para alterar o nome do Gerente");
          System.out.println("Digite 2 para atualizar o salario");
          System.out.println("Digite 3 para alterar o bonus");
          System.out.println("Digite 4 para consultar os Dados");
          System.out.println("Digite 9 para encerrar");
          System.out.println("--------------------------------------------");
    }
}
