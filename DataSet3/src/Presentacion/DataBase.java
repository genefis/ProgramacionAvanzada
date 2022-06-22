package Presentacion;

import Clases.Estudiante;
import Logica.LogEstudianteDB;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @Génesis González Fecha:21/Junio/2022
 */
public class DataBase {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<Estudiante> ArrayEstudiante = new ArrayList<Estudiante>();
        LogEstudianteDB objLogEstudianteDB = new LogEstudianteDB();
        //entrada
        ArrayEstudiante.add(new Estudiante(1, "Génesis", "Computación"));
        ArrayEstudiante.add(new Estudiante(2, "Vanessa", "Diseño"));
        ArrayEstudiante.add(new Estudiante(3, "Homero", "Economía"));

        objLogEstudianteDB.InsertarEstudiante(ArrayEstudiante);

        //limpiando arrayList
        ArrayEstudiante = new ArrayList<Estudiante>();
        ArrayEstudiante.removeAll(ArrayEstudiante);

        objLogEstudianteDB.RecuperarEstudiante(ArrayEstudiante);

        for (Estudiante objEstudiante : ArrayEstudiante) {
            System.out.println(objEstudiante.toString());
        }

    }
}
