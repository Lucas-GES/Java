
public class Liquidificador
{
   private int velocidade;
   private int velocidadeMaxima;
   
   public Liquidificador(int velocidadeMaxima)
   {
       this.velocidadeMaxima = velocidadeMaxima;
   }
   
   public void setVelocidade(int velocidade)
   {
       if (velocidade <= velocidadeMaxima){
           this.velocidade = velocidade;
       }
   }
   
   public void setvelocidadeMaxima(int velocidadeMaxima)
   {
       if (velocidadeMaxima > 0 ){
           this.velocidadeMaxima = velocidadeMaxima;
       }
   }
   
   public int getVelocidade()
   {
       return this.velocidade;
   }
   
   public int getvelocidadeMaxima()
   {
       return this.velocidadeMaxima;
   }
}
