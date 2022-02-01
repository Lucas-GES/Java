import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort extends Actor
{
    /**
     * Act - do whatever the BubbleSort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {       
        
        if(Greenfoot.mouseClicked(this)){
            MyWorld world = (MyWorld)getWorld();
            Cards cards[] = world.cards;
            
            Cards aux;
            for (int i= 0; i <cards.length-1; i++){
                for (int x = 1; x < cards.length - i; x++){
                    if(cards[x-1].getValue() > cards[x].getValue()){
                        cards[x] = world.medio(cards[x]);
                        cards[x-1] = world.medio(cards[x-1]);
                        world.atualizaCards(1);
                        
                        cards[x] = world.aumenta(cards[x]);
                        cards[x-1] = world.aumenta(cards[x-1]);
                        world.atualizaCards(8);
                        
                        aux = cards[x];
                        cards[x] = cards[x-1];
                        cards[x-1] = aux; 
                         
                        world.atualizaCards(10);
                        
                        cards[x] = world.medio(cards[x]);
                        cards[x-1] = world.medio(cards[x-1]);
                        
                        world.atualizaCards(1);
                        
                        cards[x] = world.normal(cards[x]);
                        cards[x-1] = world.normal(cards[x-1]);
                        
                        world.atualizaCards(8);
                        }
                    }
                }
            world.remover();
            world.exibirCartas(cards);     
            }
           
        }
    }     
    

