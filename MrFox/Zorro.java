import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zorro extends Actor{
    private String[] framesWalkDer = {"ZorroWalk/zorroStillR.png","ZorroWalk/zorro1R.png","ZorroWalk/zorro2R.png","ZorroWalk/zorro3R.png","ZorroWalk/zorro4R.png","ZorroWalk/zorro5R.png"};
    private String[] framesWalkIzq = {"ZorroWalk/zorroStillL.png","ZorroWalk/zorro1L.png","ZorroWalk/zorro2L.png","ZorroWalk/zorro3L.png","ZorroWalk/zorro4L.png","ZorroWalk/zorro5L.png"};
    private int xDirection=1;   //Variable usada para indicar la direccios de los frames
    private int velocity = 9;
    private String key;
    private FrameContainer frameContainer;

    
    public Zorro(){
        frameContainer = new FrameContainer();
    }
    
    public void act()
    {
        control();
        animacionConFrameContainer();
        cazar();
    }

    public void animacionConFrameContainer(){
        if(xDirection==1) {
            frameContainer.animacion(framesWalkDer, this);
        } else {
            frameContainer.animacion(framesWalkIzq, this);
        }
    }
    
    public void control(){
        key = Greenfoot.getKey();
        int x = getX();
        int y = getY();
        /*--- Controles de Direccion ---*/
        if(Greenfoot.isKeyDown("A") && canMoveLeft()){
            xDirection = -1;
            x = x - velocity;
        }
        if(Greenfoot.isKeyDown("D") && canMoveRight()){
            xDirection = 1;
            x = x + velocity;
        }
        if(Greenfoot.isKeyDown("W") && canMoveTop()){
            y = y - velocity;
        }
        if(Greenfoot.isKeyDown("S") && canMoveBot() ){
            y = y + velocity;
        }
        /*--- Controles de frameStill ---*/
        if(key==null && (Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("S"))){
            frameContainer.setFrameStill(0);
        } else {
            frameContainer.setFrameStill(1);
        }
        
        setLocation(x,y);

    }
    
    public void cazar(){
        Actor Conejo;
        Conejo = getOneObjectAtOffset(0,0,Conejo.class);
        if(Conejo != null && Greenfoot.isKeyDown("Space")){
            World detect;
            detect = getWorld();
            detect.removeObject(Conejo);
        }
    }
    
   public boolean canMoveLeft(){
       boolean canMove =  true;
       
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
                                          // x  y             // Pixeles Cerca del objeto //
       if(getOneObjectAtOffset(imageWidth / -2 -3, imageHeight / -2, Arbol.class) != null || 
          getOneObjectAtOffset(imageWidth / -2 -3, imageHeight / 2, Arbol.class) != null)
          canMove = false;
          
       return canMove;
    }
   public boolean canMoveRight(){
       boolean canMove =  true;
       
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
                                         // x  y              // Pixeles Cerca del objeto //
       if(getOneObjectAtOffset(imageWidth / 2 + 3, imageHeight / -2, Arbol.class) != null || 
          getOneObjectAtOffset(imageWidth / 2 + 3, imageHeight / 2, Arbol.class) != null)
          canMove = false;
          
       return canMove;
   }
   
   public boolean canMoveTop(){
       boolean canMove = true;
       
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
                                         // x  y              // Pixeles Cerca del objeto //
       if(getOneObjectAtOffset(imageWidth / - 2 + 3, imageHeight / -2, Arbol.class) != null || 
          getOneObjectAtOffset(imageWidth / - 2 + 3, imageHeight / 2, Arbol.class) != null)
          canMove = false;
          
       return canMove;
   }
   public boolean canMoveBot(){
       boolean canMove = true;
       
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
                                         // x  y              // Pixeles Cerca del objeto //
       if(getOneObjectAtOffset(imageWidth /  2 - 3, imageHeight / -2, Arbol.class) != null || 
          getOneObjectAtOffset(imageWidth /  2 - 3, imageHeight / 2, Arbol.class) != null)
          canMove = false;
          
       return canMove;
   }
}  

