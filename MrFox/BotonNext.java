import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonNext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonNext extends Boton
{
    private GreenfootSound clickSound = new GreenfootSound("ClickSound.mp3");
    /**
     * Act - do whatever the BotonNext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkMouse();
        
        
        if (Greenfoot.mouseClicked(this)){
             clickSound.play();
             Greenfoot.setWorld(new Mision1());
        } 
    }
}
