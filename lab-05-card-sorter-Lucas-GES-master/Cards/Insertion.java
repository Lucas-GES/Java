import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Insertion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Insertion extends Actor
{
    /**
     * Act - do whatever the Insertion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            MyWorld world = (MyWorld)getWorld();
            Cards cards[] = world.cards;
            
            int aux = cards.length;
            for (int i= 1; i < aux; i++){
                Cards key = cards[i];
                int x = i - 1;
                while (x > -1 && cards[x].getValue() > key.getValue()){
                        cards[x+1] = world.medio(cards[x+1]);
                        world.atualizaCards(1);                       
                        cards[x+1] = world.aumenta(cards[x+1]);
                        world.atualizaCards(8);
                        
                        cards[x + 1] = cards[x];
                        x--;
                    
                        world.atualizaCards(10);                
                        cards[x+1] = world.medio(cards[x+1]);                        
                        world.atualizaCards(1);
                        cards[x+1] = world.normal(cards[x+1]);                        
                        world.atualizaCards(8);
                }
                cards[x + 1] = key;
                world.remover();
                world.exibirCartas(cards);     
            }
    }    
    }
}
