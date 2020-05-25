import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HUD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HUD extends Actor
{
    private int vida;
    private int comida;
    /**
     * Act - do whatever the HUD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HUD(int vida,int comida){
        this.vida = vida;
        this.comida = comida;
    }
    public void act() 
    {
        // Add your action code here.
        
    }
    
    public void hudStatus(){
        
    }
}
