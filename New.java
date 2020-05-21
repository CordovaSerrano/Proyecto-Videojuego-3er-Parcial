import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NEW here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class New extends Actor
{
    public New(){
    }
    /**
     * Act - do whatever the NEW wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)){
             Greenfoot.setWorld(new NewGame());
        }   
    }   
}
