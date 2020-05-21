import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mision1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mision1 extends World
{

    /**
     * Constructor for objects of class Mision1.
     * 
     */
    public Mision1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        
        Zorro zorro = new Zorro();
        Gallina gallina = new Gallina();
        
        addObject(zorro,500,510);
        addObject(gallina,300,500);
    }
}
