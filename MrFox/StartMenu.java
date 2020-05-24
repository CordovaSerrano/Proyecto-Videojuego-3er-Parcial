import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends Menu
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public StartMenu()
    { 
        prepare();
        
        addObject(new BotonStart(),520,420);
    }
        
    private void prepare()
    {
    }
}
