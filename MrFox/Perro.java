import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Perro extends Personaje
{
    private String[] framesWalkDer = {"Perro/perro1R.png","Perro/perro2R.png","Perro/perro3R.png","Perro/perro4R.png","Perro/perro5R.png"};
    private String[] framesWalkIzq = {"Perro/perro1L.png","Perro/perro2L.png","Perro/perro3L.png","Perro/perro4L.png","Perro/perro5L.png"};
    
    private String key;
    private FrameContainer frameContainer;
    //private int DireccionX=1;
    
    private Zorro Zorro;
    public Perro(){
        super(5);
        frameContainer = new FrameContainer();
        Zorro = new Zorro();
    }
    
    public void act() 
    {
        //frameContainer = new FrameContainer();
        IAperro();
        animacionConFrameContainer();
    }
    
    public void IAperro(){
        key = Greenfoot.getKey();
        x = getX();
        y = getY();
        /*---IA Perro---*/
        //Variables para rastrear al Zorro
        Actor zorro = getWorld().getObjects(Zorro.class).get(0);
        int xZorro = zorro.getX();
        int yZorro = zorro.getY();
        
        if(((Zorro)zorro).zorroEscondido()==true){
            moverseEnDireccionesAleatorias(15);
        }else{
            persegirZorro(xZorro, x, yZorro, y);
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
        if(DireccionX==1) {
            frameContainer.animacion(framesWalkDer, this);
        } else {
            frameContainer.animacion(framesWalkIzq, this);
        }
    }
    
    public void persegirZorro(int xZorro, int x, int yZorro, int y){
        if(xZorro<x){
            this.x = x - velocity;
            DireccionX= -1;
        }
        else{
            this.x = x + velocity;
            DireccionX= 1;
        }
        if(yZorro<y){
            this.y = y - velocity;
        }
        else{
            this.y = y + velocity;
        }
    }
}
