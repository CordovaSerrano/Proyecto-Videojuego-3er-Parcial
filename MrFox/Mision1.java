import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;

/**
 * Write a description of class Mision1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mision1 extends Misiones
{
    private ArrayList<Double> coordenadas;
    /**
     * Constructor for objects of class Mision1.
     * 
     */
    public Mision1()
    {  
        String name ="files\\coordenadas_arboles.txt";
        ArrayList coordenadas = new ArrayList();
        
        File spawnTree = new File(name);
        archivos a = new archivos();
        
        
        Zorro zorro = new Zorro();
        Gallina gallina = new Gallina();
        
        addObject(zorro,500,510);
        addObject(gallina,300,500);
         /*---Madrigeras---*/
        Madrigera m1 = new Madrigera();
        addObject(m1,200,510);
        spawnTrees();
    }
    
    public void spawnTrees(){
        //Coordenadas de los arboles
        int x[]= {35,140,820,552,262,490,950,880,562,54,64,430};
        int y[]= {50,300,400,618,658,526,270,95,232,570,742,481};
      
        for(int i=0; i<12;i++){
            addObject(new Arbol(),x[i],y[i]);
        }
       
    }
}

