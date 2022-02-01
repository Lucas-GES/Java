import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Cards[] cards = new Cards[52];
    private BubbleSort bubble = new BubbleSort();
    private Embaralhar embaralha = new Embaralhar();
    private Select select = new Select();
    private Insertion insertion = new Insertion();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        criarCartas();
        criarBotoes();
        exibirCartas(cards);        
    }
    
    private void criarCartas(){
        for(int x=0; x < cards.length; x++){
            cards[x] = new Cards(0.40, (x+1));            
        }
    }
    
    public void exibirCartas(Cards cards[]){
        for(int x=0; x < 13; x++){
            addObject(cards[x], 100+ (x*70), 150);
            addObject(cards[13+x], 100+ (x*70), 250);
            addObject(cards[26+x], 100+(x*70), 350);
            addObject(cards[39+x], 100+(x*70), 450); 
        }        
        
    }
    
    public void remover(){
        this.removeObjects(this.getObjects(Cards.class));
    }
        
    public void criarBotoes(){
        addObject(embaralha, 100, 53);
        addObject(bubble, 350, 53);   
        addObject(select, 550, 53); 
        addObject(insertion, 750, 53); 
    }
    
    public void atualizaCards(int delay){
        this.removeObjects(this.getObjects(Cards.class));
        
        int initialX = 100;
        int cardY = 150;
        int cardCount = 1;
        
        for(int i = 0; i < 13; i++){
            addObject(cards[i], 100 + (i * 70), 150);
            addObject(cards[13+i], 100+ (i*70), 250);
            addObject(cards[26+i], 100+(i*70), 350);
            addObject(cards[39+i], 100+(i*70), 450);
            cardCount++;
            
            /*if(i == 12 || i == 25 || i == 30){
                cardY += 100;
                cardCount = 1; 
            }*/
        }
        Greenfoot.delay(delay);
    }
    
    public Cards aumenta(Cards card){
        card = new Cards(0.70, card.getValue());
        return card;
    }
    
    public Cards medio(Cards card){
        card = new Cards(0.50, card.getValue());
        return card;
    }
    
    public Cards normal(Cards card){
        card = new Cards(0.40, card.getValue());
        return card;
    }
}
