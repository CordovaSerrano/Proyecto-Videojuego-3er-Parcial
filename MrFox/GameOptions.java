import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOptions extends World
{

    /**
     * Constructor for objects of class GameOptions.
     * 
     */
    public GameOptions()
    {    
        super(1000, 800, 1); 
   
        BotonNew botonNew = new BotonNew();
        BotonLoad botonLoad = new BotonLoad();
        addObject(botonNew,520,350);
        addObject(botonLoad,520,490);
        
    }
}
