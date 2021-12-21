
public class LiquidificadorDigital extends Liquidificador
{
     
   public LiquidificadorDigital(int velocidadeMaxima)
   {
       super(velocidadeMaxima);              
   }
   
   public void trocarVelocidade(int velocidade)
   {
       if (velocidade <= super.getvelocidadeMaxima() && velocidade > 0){
           super.setVelocidade(velocidade);
           }else if (velocidade < 0){
               System.out.println("error404" + '\n');
            }else{
                System.out.println("Valor Maximo: " + super.getvelocidadeMaxima() + "!!!" + '\n');
            }
       }
   }

