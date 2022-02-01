import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Collections;
/**
 * Write a description of class embaralhar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Embaralhar extends Actor
{    
    public void act() 
    {
              
        if(Greenfoot.mouseClicked(this)){
          MyWorld world = (MyWorld)getWorld();
          Cards[] cartas1 = world.cards;
          Cards[] cartas2 = cartas1;
          
          Cards teste;
           for(int i=0; i< 52; i++){
            int n = 0 + (int)(Math.random() * ((52 - 0) + 0));
            int j = 0 + (int)(Math.random() * ((52 - 0) + 0));
            
            teste = cartas1[n];
            cartas1[n] = cartas2[j];
            cartas2[j] = teste;
            cartas1[j] = teste;
          }
          world.remover();
          world.exibirCartas(cartas1);
        }
    }        
    
}
