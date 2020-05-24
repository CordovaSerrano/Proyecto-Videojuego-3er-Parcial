import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Conejo extends Actor
{
    private String[] framesWalkDer = {"ConejoWalk/conejoWalk1R.png","ConejoWalk/conejoWalk2R.png","ConejoWalk/conejoWalk3R.png","ConejoWalk/conejoWalk4R.png","ConejoWalk/conejoWalk5R.png"};
    private String[] framesWalkIzq = {"ConejoWalk/conejoWalk1L.png","ConejoWalk/conejoWalk2L.png","ConejoWalk/conejoWalk3L.png","ConejoWalk/conejoWalk4L.png","ConejoWalk/conejoWalk5L.png"};
        
    private int velocity = 10;
    private String key;
    private FrameContainer frameContainer;
    
    /*---Variables usadas para direcciones random---*/
    private Random DireccionConejo;
    private int DireccionConejoX;
    private int DireccionConejoY;
    private int contadorParaCambiarDireccion=0;
    
    public Conejo(){
        frameContainer = new FrameContainer();
        DireccionConejo = new Random();
    }
    
    public void act() 
    {
        IAconejo();
        animacionConFrameContainer();
    }    
    
    public void IAconejo(){
        key = Greenfoot.getKey();
        int x = getX();
        int y = getY();
        
        /*---IA---*/
        if(contadorParaCambiarDireccion==0){
            DireccionConejoX = DireccionConejo.nextInt(2); //Numero aleatorio entre 0 y 1
            DireccionConejoY = DireccionConejo.nextInt(2); //Numero aleatorio entre 0 y 1
            contadorParaCambiarDireccion=15;
        }
        else{
            contadorParaCambiarDireccion--;
        }
        if(DireccionConejoX==0){
            x = x - velocity;
        }
        if(DireccionConejoX==1){
            x = x + velocity;
        }
        if(DireccionConejoY==0){
            y = y - velocity;
        }
        if(DireccionConejoY==1){
            y = y + velocity;
        }
        /*--- Controles de frameStill ---*/
        if(key==null){
            frameContainer.setFrameStill(0);
        } else {
            frameContainer.setFrameStill(1);
        }
        
        setLocation(x,y);
        
    }
    
    public void animacionConFrameContainer(){
        if(DireccionConejoX==1) {
            frameContainer.animacion(framesWalkDer, this);
        } else {
            frameContainer.animacion(framesWalkIzq, this);
        }
    }
}
