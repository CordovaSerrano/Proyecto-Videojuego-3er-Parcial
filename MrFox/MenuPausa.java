import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuPausa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPausa
{
    private static MenuPausa menuPausa;
    private static Pause pause;
    private static Continue continuar;
    private static Options options;
    private static SaveGame saveGame;
    private static Exit exit;
    
    private MenuPausa(){
        
    }
    
    public static MenuPausa getMenuPausa(){
        if(menuPausa == null){
            menuPausa = new MenuPausa();
        }
        return menuPausa;
    }
    //Getters de la instancia de cada uno de los botones del menu
    public Pause getPause(){
        if(pause == null){
            pause = new Pause();
        }
        return pause;
    }
    public Continue getContinue(){
        if(continuar == null){
            continuar = new Continue();
        }
        return continuar;
    }
    public Options getOption(){
        if(options == null){
            options = new Options();
        }
        return options;
    }
    public SaveGame getSaveGame(){
        if(saveGame == null){
            saveGame = new SaveGame();
        }
        return saveGame;
    }
    public Exit getExit(){
        if(exit == null){
            exit = new Exit();
        }
        return exit;
    }
}
