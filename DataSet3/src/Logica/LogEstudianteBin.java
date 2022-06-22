package Logica;

import Archivos.EstudianteBin;
import Clases.Estudiante;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Génesis González FEcha de junio
 */
public class LogEstudianteBin {

    EstudianteBin objEstudianteBin = new EstudianteBin();

    public boolean ValidarCod(Estudiante objEstudiante) throws IOException {
        ArrayList<Estudiante> ArrayEstudiantes = new ArrayList<Estudiante>();
        // valida si el codigo es correcto
        if (objEstudiante.getCod() > 0) {
            // agregar al archvio texto  
            ArrayEstudiantes.add(objEstudiante);
            return objEstudianteBin.GrabarEstudianteBin(ArrayEstudiantes);
        }
        return false;
    }

    public void ListarEstudiante(ArrayList<Estudiante> ArrayEstudiantes) throws IOException, FileNotFoundException, ClassNotFoundException {
        objEstudianteBin.ImportarEstudianteBin(ArrayEstudiantes);
    }
}
