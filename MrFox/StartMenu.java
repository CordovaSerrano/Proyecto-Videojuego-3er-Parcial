import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends Menu
{   
    public GreenfootSound theme = new GreenfootSound("Intro.mp3");
    private Boton next = new BotonNext();
    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public StartMenu()
    {   
        play();
        
        Greenfoot.delay(190);
        prepare();
        
        addObject(new BotonStart(),520,420);
    }
    public void play(){
        theme.setVolume(25);
        //theme.play();
        
    }
    public void stop(){
        theme.stop();
    }
    private void prepare()
    {
    }
}
