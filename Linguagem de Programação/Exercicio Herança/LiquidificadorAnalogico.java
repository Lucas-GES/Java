

public class LiquidificadorAnalogico extends Liquidificador
{
    private int aumentarVelocidade = super.getVelocidade();
    private int diminuirVelocidade;
    
    public LiquidificadorAnalogico(int velocidadeMaxima )
    {
        super(velocidadeMaxima);        
    }
    
    public void aumentarVelocidade()
    {
        if (super.getVelocidade() < super.getvelocidadeMaxima()){
          this.aumentarVelocidade ++; 
          super.setVelocidade(this.aumentarVelocidade);
        }else{
         System.out.println("Velocidade Maxima Alcançada!" + '\n');
        }
    }
    
    public void diminuirVelocidade()
    {
      this.diminuirVelocidade = super.getVelocidade();
        if(super.getVelocidade() > 0)
        {
        diminuirVelocidade --;
        super.setVelocidade(diminuirVelocidade);
      }else{
       System.out.println("Velocidade Minima Alcançada!" + '\n');
     }
    }
}
