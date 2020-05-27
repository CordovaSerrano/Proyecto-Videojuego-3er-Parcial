import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose
{
    private static Lose lose;
    private static YouLose youLose;
    private static Exit exit;
    private static TryAgain tryAgain;
    
    private Lose(){
        
    }
    
    public static Lose getLose(){
        if(lose == null){
            lose = new Lose();
        }
        return lose;
    }
    
    public YouLose getYouLose(){
        if(youLose == null){
            youLose = new YouLose();
        }
        return youLose;
    }
    
    public Exit getExit(){
        if(exit == null){
            exit = new Exit();
        }
        return exit;
    }
    
    public TryAgain getTryAgain(){
        if(tryAgain == null){
            tryAgain = new TryAgain();
        }
        return tryAgain;
    }
}
