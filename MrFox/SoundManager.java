import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoundManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundManager
{
    public GreenfootSound intro = new GreenfootSound("Intro.mp3"); // Musica para la intro
    private GreenfootSound musicM1 = new GreenfootSound("Forest.mp3");  //Musica para la mision1
    
    
    public void playIntro(){
        intro.setVolume(25);
        intro.play();
        
    }
    
    public void stopIntro(){
        intro.stop();
    }
    
    public void playMusicM1(){
        musicM1.play();
    }
    
    public void stopMusicM1(){
        musicM1.stop();
    }
}
