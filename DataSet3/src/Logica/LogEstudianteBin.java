package Logica;


import Archivos.EstudianteBin;
import Clases.Estudiante;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Génesis González
 * FEcha  de junio
 */
public class LogEstudianteBin {
    EstudianteBin objClienteBin = new EstudianteBin();
    
    public boolean ValidarId(Estudiante objCliente) throws IOException {
        ArrayList<Estudiante> ArrayClientes = new ArrayList<Estudiante>();
        // valida si el codigo es correcto
        if (objCliente.getCod() > 0){
            // agregar al archvio texto  
            ArrayClientes.add(objCliente);
            return objClienteBin.GrabarEstudianteBin(ArrayClientes);
        }
        return false;
    }

    public void ListarClientes(ArrayList<Estudiante> ArrayClientes) throws IOException, FileNotFoundException, ClassNotFoundException{
        objClienteBin.ImportarClienteBin(ArrayClientes);
    
    }
    
}
