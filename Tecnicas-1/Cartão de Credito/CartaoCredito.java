
/**
 * Escreva a descrição da classe CartaoCredito aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class CartaoCredito
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int Numero;
    private float saldo;
    private float limite;
    private float bonus;
    private String bandeira;

    /**
     * COnstrutor para objetos da classe CartaoCredito
     */
    public CartaoCredito(int Numero , String bandeira)
    {
        this.Numero = Numero;
        this.bandeira = bandeira;
    }
    public CartaoCredito(int Numero , float limite , String bandeira)
    {
        this.Numero = Numero;
        this.limite = limite;
        this.bandeira = bandeira;
    }
    public float getSaldo()
    {    
        return this.saldo;    
    }
    public float getLimite()
    {    
        return this.limite;    
    }
    public float getBonus()
    {    
        return this.bonus;    
    }
    public String getBandeira()
    {    
        return this.bandeira;    
    }
    public int getNumero()
    {    
        return this.Numero;    
    }
    public void setBandeira(String bandeira){
        if(!bandeira.trim().equals("")){
            this.bandeira = bandeira.trim();        
        }else{
            System.out.println("Incorreto");
        }
    }
    public void setLimite(float limite){
        if(limite > 0){
            this.limite = limite;
       }else{
            System.out.println("Valor Incorreto");
       }           
    }
    public void addPagar(float valorPago){
       if(saldo > 0){
        saldo -= valorPago;
        this.bonus += (valorPago * 0.02f);
      }else{
          System.out.println("Não há nada para ser pago");
      }
    }
    public void addComprar(float valorCompra){
       if(valorCompra + saldo <= this.limite){
        saldo += valorCompra;
        this.bonus += (valorCompra * 0.03f);    
      }else{
        System.out.println("Valor acima do saldo permitido"); 
      }   
    }
    public void getMenu(){
       System.out.println("Menu do Cartão");
       System.out.println("--------------------------------------------");
       System.out.println("Digite 1 para atualizar a bandeira do cartão");
       System.out.println("Digite 2 para atualizar o limite");
       System.out.println("Digite 3 para fazer uma compra");
       System.out.println("Digite 4 para pagar");
       System.out.println("Digite 5 para Consultar seu cartão");
       System.out.println("Digite 9 para encerrar");
       System.out.println("--------------------------------------------");   
    }
}
