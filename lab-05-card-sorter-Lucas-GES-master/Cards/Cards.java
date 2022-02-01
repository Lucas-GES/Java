import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cards extends Actor 
{
    private int width ;
    private int height;
    private int value;
    private String cardName;
    
    public int getValue(){
       return this.value;
    }
    
    public Cards(double scale, int _value){
        this.value = _value;
        String path = "images";
        cardName = this.value+".png";
        this.setImage(cardName);
        width = this.getImage().getWidth();
        height = this.getImage().getHeight();
        this.getImage().scale((int)(scale * width),(int)(scale * height));
    }   
        
    
}
