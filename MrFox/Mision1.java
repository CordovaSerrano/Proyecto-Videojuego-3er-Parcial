import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;

/**
 * Write a description of class Mision1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mision1 extends World
{
    private ArrayList<Double> coordenadas;
    /**
     * Constructor for objects of class Mision1.
     * 
     */
    public Mision1()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        String name ="files\\coordenadas_arboles.txt";
        ArrayList coordenadas = new ArrayList();
        
        File spawnTree = new File(name);
        archivos a = new archivos();
        
        
        Zorro zorro = new Zorro();
        Gallina gallina = new Gallina();
        
        addObject(zorro,500,510);
        addObject(gallina,300,500);
        
        System.out.println(spawnTree.getAbsolutePath());
        System.out.println(spawnTree.exists());
        System.out.println(a.leerTxt("files\\coordenadas_arboles.txt"));
        
        spawnTrees(name);
        coordenadas = a.coordenadas(name);   
    }
    
    public void spawnTrees(String name){   
        
        
        
        
    }
}

