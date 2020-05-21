import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LOAD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Load extends Actor
{
     public Load(){
         
    }
    /**
     * Act - do whatever the LOAD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)){
             Greenfoot.setWorld(new GameSaved());
            }
    }    
}
