import java.io.*;
import java.util.*;

public class archivos {

    public String leerTxt(String address) //direccion del archivo
    {
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(address));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                //Haz el ciclo mientras bfRead tenga datos
                temp = temp + bfRead; //texto del archivo guardado (concatenando)

            }
            texto = temp;
        }catch (Exception e){
            System.err.println("FILE NOT FOUND");
        }
        return texto;
    }
    
    /*
    public List coordenadas(String addres)
    {
        ArrayList<int> listaCoordenadas;
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(address));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                //Haz el ciclo mientras bfRead tenga datos
                temp = temp + bfRead; //texto del archivo guardado (concatenando)

            }
            texto = temp;
        }catch (Exception e){
            System.err.println("FILE NOT FOUND");
        }
        
        return listaCoordenadas;
    }*/
}
