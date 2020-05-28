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
    private int velPerro;
    private int noPerros;
    private int dificultad; //1 = Easy, 2 = Medium, 3 = Hard//
    //Creacion de Personajes//
    Zorro zorro = new Zorro();
    Gallina gallina = new Gallina();
    Perro perro1 = new Perro(velPerro);
    Perro perro2 = new Perro(velPerro);
    Perro perro3 = new Perro(velPerro);
    Perro perro4 = new Perro(velPerro);
    //Creacion de Entorno//
    Madrigera m1 = new Madrigera();
    Madrigera m2 = new Madrigera();
    //Creacion del HUD//
    HUD hud = new HUD();
    /**
     * Constructor for objects of class Mision1.
     * 
     */
    public Mision1(int dificultad,int noPerros,int noArbustos,int velPerro)
    {   
        this.velPerro = velPerro;
        this.noPerros = noPerros;
        this.dificultad = dificultad;
        spawnBushes(noArbustos);
        spawnDogs(noPerros,velPerro);
        prepare();
    }
    
    private void prepare(){
        SoundManager sound = SoundManager.getSoundManager();
        sound.stopIntro();
        sound.playMusicM1();
        //Personajes agregados a Mision1//
        addObject(zorro,710,427);
        zorro.setVida(vida);
        zorro.setComida(comida);
        addObject(gallina,300,500);
        addObject(m1,540,38);
        addObject(m2,657,646);
        spawnTrees();
        hud.hudStatus(vida,comida);
        addObject(hud,520,750);
    }
    
    public void act(){
        Actor Perro;
        
        if(Greenfoot.isKeyDown("P")){
            clickSound.play();
            menuPause();
        }
        
        if(zorro.zorroAtacado()){
            deleteDogs();
            if(vida == 0){
            }else{
            spawnDogs(noPerros,velPerro);        
            vida = vida - 1;
            zorro.setVida(vida);
            hud.hudStatus(vida,comida);
            }
        }
        if(zorro.isOver()){
            youLose();
        }
    }
   
    public void spawnTrees(){
        //Coordenadas de los arboles
        int x[]= {985,931,817,520,277,107,351,244};
        int y[]= {446,357,696,344,660,669,31,3};
      
        for(int i=0; i<8;i++){
            addObject(new Arbol(),x[i],y[i]);
        }
       
    }
    
    public void spawnBushes(int noArbustos){
        int x[]= {946,864,867,520,288,98};
        int y[]= {760,481,74,511,137,504};
        
        for(int i=0; i<noArbustos;i++){
            addObject(new Arbusto(),x[i],y[i]);
        }
       
    }
    
    public void spawnDogs(int noPerros,int velPerro){
        int x[]= {5,167,971,542};
        int y[]= {179,772,782,16};
        
        for(int i=0; i<noPerros;i++){
            addObject(new Perro(velPerro),x[i],y[i]);
        }
    }
    public void deleteDogs(){
        List remove = getObjects( Perro.class );
        for (Object objects : remove)
        removeObject( ( Perro ) objects );
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

