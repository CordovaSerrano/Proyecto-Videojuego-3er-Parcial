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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
   
        New botonNew = new New();
        Load botonLoad = new Load();
        addObject(botonNew,520,350);
        addObject(botonLoad,520,490);
    }
}
