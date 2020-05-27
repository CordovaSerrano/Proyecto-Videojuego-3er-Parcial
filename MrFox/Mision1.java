import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;

/**
 * Write a description of class Mision1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mision1 extends Misiones{
    protected GreenfootSound clickSound = new GreenfootSound("ClickSound.mp3");
    private int vida = 3;
    private int comida = 0;
    //Creacion de Personajes//
    Zorro zorro = new Zorro();
    Gallina gallina = new Gallina();
    Perro perro = new Perro();
    //Creacion de Entorno//
    Madrigera m1 = new Madrigera();
    Arbusto a1 = new Arbusto();
    //Creacion del HUD//
    HUD hud = new HUD();
    /**
     * Constructor for objects of class Mision1.
     * 
     */
    public Mision1()
    {   
        prepare();
    }
    
    private void prepare(){
        SoundManager sound = SoundManager.getSoundManager();
        sound.stopIntro();
        sound.playMusicM1();
        //Personajes agregados a Mision1//
        addObject(zorro,500,510);
        zorro.setVida(vida);
        zorro.setComida(comida);
        addObject(gallina,300,500);
        addObject(perro,0,200);
        addObject(m1,200,510);
        addObject(a1,200,600);
        spawnTrees();
        hud.hudStatus(vida,comida);
        addObject(hud,520,750);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("P")){
            clickSound.play();
            menuPause();
        }
        
        if(zorro.zorroAtacado()){
            if(vida == 0){
            }else{
            addObject(perro,0,200);
            vida = vida - 1;
            zorro.setVida(vida);
            hud.hudStatus(vida,comida);
            }
        }
        if(vida == 0){
             removeObject(perro);
            }
        if(zorro.isOver()){
            youLose();
        }
    }
   
    public void spawnTrees(){
        //Coordenadas de los arboles
        int x[]= {35,140,820,552,262,490,950,880,562,54,64,430};
        int y[]= {50,300,400,618,658,526,270,95,232,570,742,481};
      
        for(int i=0; i<12;i++){
            addObject(new Arbol(),x[i],y[i]);
        }
       
    }
    
    public void menuPause(){    
        MenuPausa menuPausa = MenuPausa.getMenuPausa();
            
        addObject(menuPausa.getPause(),530,400);
        addObject(menuPausa.getContinue(),530,290);
        addObject(menuPausa.getOption(),530,360);
        addObject(menuPausa.getSaveGame(),530,430);
        addObject(menuPausa.getExit(),530,500);        
    }
    
    public void youLose(){    
        Lose youLose = Lose.getLose();
            
        addObject(youLose.getYouLose(),530,400);
        addObject(youLose.getExit(),435,455);
        addObject(youLose.getTryAgain(),620,455);
    }
}

