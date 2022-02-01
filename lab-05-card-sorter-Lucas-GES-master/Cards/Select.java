import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select extends Actor
{
    /**
     * Act - do whatever the Select wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            MyWorld world = (MyWorld)getWorld();
            Cards cards[] = world.cards;
            
            Cards smallNumber;
            for (int i= 0; i <cards.length-1; i++){
                 int aux = i;
                for (int x = i + 1; x < cards.length ; x++){
                    if(cards[x].getValue() < cards[aux].getValue()){
                         aux = x;                                                  
                        }
                        }
                        cards[i] = world.medio(cards[i]);
                        cards[aux] = world.medio(cards[aux]);
                        world.atualizaCards(1);                        
                        cards[i] = world.aumenta(cards[i]);
                        cards[aux] = world.aumenta(cards[aux]);
                        world.atualizaCards(8);
                        
                        smallNumber = cards[aux];
                        cards[aux] = cards[i];
                        cards[i] = smallNumber; 
                
                        world.atualizaCards(10);                        
                        cards[i] = world.medio(cards[i]);
                        cards[aux] = world.medio(cards[aux]);                        
                        world.atualizaCards(1);                        
                        cards[i] = world.normal(cards[i]);
                        cards[aux] = world.normal(cards[aux]);                        
                        world.atualizaCards(8);
            }
            world.remover();
            world.exibirCartas(cards);     
         }
    }    
}
