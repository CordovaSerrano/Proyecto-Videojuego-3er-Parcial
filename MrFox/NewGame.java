import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewGame extends World
{

    /**
     * Constructor for objects of class NewGame.
     * 
     */
    public NewGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        
        BotonNext siguiente = new BotonNext();
        
        addObject(siguiente,820,620);
    }
}
