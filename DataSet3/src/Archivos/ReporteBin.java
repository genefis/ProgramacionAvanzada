package Archivos;

import Clases.Reporte;
import Logica.MiObjectOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



/**
 * @author Génesis González
 */
public class ReporteBin {
    static String fichero = "ReporteBin.dat";
    public static boolean GrabarReporteBin(ArrayList<Reporte> ArrayReporte) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fichero,false));  //elimine o cree
        for (Reporte reporte:  ArrayReporte){
            // grabar todo el objeto
            oos.writeObject(reporte);
        }
        oos.close();  // Se cierra al terminar.
        return true;
    }
    
    public static void ImportarReporteBin(ArrayList<Reporte> ArrayReporte) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Reporte aux = (Reporte) ois.readObject();
            while (aux!=null){
                if (aux instanceof Reporte) {               
                    //System.out.println(aux);
                    ArrayReporte.add((Reporte)aux);
                }
                aux = (Reporte) ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de archivo");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        
    }
    
    public static void AddReporteBin (ArrayList<Reporte> ArrayReporte)
    {
        try
        {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));
            // Se hace el new fuera del bucle, s�lo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            for (Reporte reporte:  ArrayReporte){
                oos.writeUnshared(reporte);
        }
        oos.close();  // Se cierra al terminar.
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    
}
