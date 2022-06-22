package Archivos;
import Clases.Estudiante;
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
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class EstudianteBin {
    static String fichero = "EstudianteBin.dat";
    public static boolean GrabarEstudianteBin(ArrayList<Estudiante> ArrayEstudiante) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fichero,false));  //elimine o cree
        for (Estudiante estudiante:  ArrayEstudiante){
            // grabar todo el objeto
            oos.writeObject(estudiante);
        }
        oos.close();  // Se cierra al terminar.
        return true;
    }
    
    public static void ImportarClienteBin(ArrayList<Estudiante> ArrayEstudiante) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Estudiante aux = (Estudiante) ois.readObject();
            while (aux!=null){
                if (aux instanceof Estudiante) {               
                    //System.out.println(aux);
                    ArrayEstudiante.add((Estudiante)aux);
                }
                aux = (Estudiante) ois.readObject();
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
    
    public static void AddClienteBin (ArrayList<Estudiante> ArrayEstudiante)
    {
        try
        {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));
            // Se hace el new fuera del bucle, s�lo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            for (Estudiante estudiante:  ArrayEstudiante){
                oos.writeUnshared(estudiante);
        }
        oos.close();  // Se cierra al terminar.
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    
    
}