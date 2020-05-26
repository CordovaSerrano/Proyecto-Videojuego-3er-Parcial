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
    /**
     * Constructor for objects of class Mision1.
     * 
     */
    public Mision1()
    {   
        String name ="files\\coordenadas_arboles.txt";
        //Creacion de Personajes//
        Zorro zorro = new Zorro();
        Gallina gallina = new Gallina();
        //Perro perro = new Perro();
        
        addObject(zorro,500,510);
        addObject(gallina,300,500);
        //addObject(perro,100,200);
        //Creacion de Entorno//
        Madrigera m1 = new Madrigera();
        Arbusto a1 = new Arbusto();
        
        addObject(m1,200,510);
        addObject(a1,200,600);
        spawnTrees();
        //Creacion del HUD//
        HUD hud = new HUD(3,3);
        addObject(hud,520,750);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("P")){
            menuPause();
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
            addObject(new Pause(),530,400);
            addObject(new Continue(),530,290);
            addObject(new Options(),530,360);
            addObject(new SaveGame(),530,430);
            addObject(new Exit(),530,500);
    }
}

