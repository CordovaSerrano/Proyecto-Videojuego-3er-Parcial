import java.util.List;

public class HUD {
    private List<String> HUD;
    private int vida;
    private int comida;

    public HUD(){
        HUD.add("0/3");
        HUD.add("1/3");
        HUD.add("2/3");
        HUD.add("3/3");
        HUD.add("0/2");
        HUD.add("1/2");
        HUD.add("2/2");
        HUD.add("3/2");
        HUD.add("0/1");
        HUD.add("1/1");
        HUD.add("2/1");
        HUD.add("3/1");
    }

    public int calculoCarneYVida(int vida, int comida){
        int resultado;
        int HUDSize = HUD.size()/3;
        resultado = (vida * HUDSize + comida) - 1;
        return resultado;
    }
}
