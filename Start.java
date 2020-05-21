import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class START here.
 * Boton que da inicio al juego
 * @author (Eduardo Javier Córdova Serrano) 
 * @version (11 de Mayo del 2020)
 */
public class BotonStart extends Actor
{   
    public Start(){
        
    }
    /**
     * Act - do whatever the START wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mousePressed(this)){
             Greenfoot.setWorld(new GameOptions());
    }   
    } 
}
