import java.io.*;
import java.util.*;
import java.lang.*;

public class archivos {

    public int[][] readFile(String nameFile){
        int[][] coordenadas;
        coordenadas = new int[12][12];
        
        Scanner archivo = null;
        try{
        archivo = new Scanner(new File(nameFile));
        }
        catch(Exception e){
            System.err.println("Archivo no encontrado");
        }
        int num=0, i, j;
        while(archivo.hasNext()){
            
            for(i=0; i<12;i++){
                for(j=0;j<2;j++){
                    num = archivo.nextInt(); //El valor tipo string es convertido a entero
                    System.out.println("Valor entero: "+num);
                    coordenadas[i][j] = num;
                    System.out.println("["+i+"]["+j+"] ="+coordenadas[i][j]);
                }
            }
        }
        return coordenadas;
    }
}
