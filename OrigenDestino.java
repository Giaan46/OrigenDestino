package tokio.school;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrigenDestino {
    public static void main(String[] args) throws FileNotFoundException {

       try{
           BufferedReader br = new BufferedReader(new FileReader("M2_T02_Origen (1).txt"));
           PrintWriter destino = new PrintWriter(new FileWriter("Destino.txt"));
           String linea ;
           while((linea = br.readLine())!=null){
               String espacios = " ";
               String guiones = "-";
               String texto = linea.replace(espacios, guiones);
               destino.println(texto);
               System.out.println("Fiechero editado ");
           }
          br.close();
           destino.close();
       }catch (FileNotFoundException fnfe){
           fnfe.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }


    }
    }
