package Logica;
import Archivos.EstudianteTxt;
import Clases.Estudiante;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Génesis González
 * FEcha  de junio
 */
public class LogEstudianteTxt {
    EstudianteTxt objEstudianteTxt = new EstudianteTxt();
    public boolean ValidarCod(Estudiante objEstudiante) throws IOException {
        // valida si el codigo es correcto
        if (objEstudiante.getCod() > 0){
            // agregar al archvio texto            
            return objEstudianteTxt.AgregarEstudiante(objEstudiante);
        }
        return false;
    }

    public void ListarEstudiante(ArrayList<Estudiante> ArrayEstudiante){
        objEstudianteTxt.LeerEstudiante(ArrayEstudiante);
    
    }
    
}
