import java.io.*;
import java.util.*;
import java.lang.*;

public class archivos {

    public String leerTxt(String address) //direccion del archivo
    {
        String texto = "";
        String dato = "";
        
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
    
    public ArrayList coordenadas(String name){
        File archivo = null;
        FileReader fr = null;
        ArrayList lineas = new ArrayList();
        try {
        archivo = new File (name);
        String linea;
        fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        while((linea=br.readLine())!=null){
        lineas.add(linea);
        }
        System.out.print ("Coordenadas de Arboles: \n"); //MOSTRAR LOS DATOS DEL ARREGLO
        for (int j = 0 ; j < lineas.size() ; j++){
        linea = (String)lineas.get(j);
        System.out.print ( linea + "\n" );
        }
        }//FIN DEL TRY
        catch(IOException e){
        System.out.println(e);
        }
        
        return lineas;
    }
}
