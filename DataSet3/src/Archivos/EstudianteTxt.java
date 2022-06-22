package Archivos;
import Clases.Estudiante;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class EstudianteTxt {
    
    public boolean AgregarEstudiante(Estudiante estudiante) throws IOException{
       File f = new File("Estudiante.txt");
       FileWriter fw = new FileWriter(f,false);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(Integer.toString(estudiante.getCod())+",");
       bw.write(estudiante.getNombre()+",");
       bw.write(String.valueOf(estudiante.getCarrera())+"\n");
       bw.close();
       fw.close();
       return true;
    }
    
    
     public  ArrayList<Estudiante>
            LeerEstudiante(ArrayList<Estudiante> ArrayEstudiante){        
        File f = new File("estudiante.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                     Estudiante Objtmp = new Estudiante(
                             Integer.valueOf(st.nextToken()),
                             st.nextToken(), //nombres
                             st.nextToken()
                     );                     
                     ArrayEstudiante.add(Objtmp);
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayEstudiante;
    }
}
