package Presentacion;
import Clases.Estudiante;
import Logica.LogEstudianteDB;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class DataBase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<Estudiante> ArrayEstudiante = new ArrayList<Estudiante>();
        LogEstudianteDB objLogClienteDB = new LogEstudianteDB();
        //entrada
      ArrayEstudiante.add(new Estudiante(1,"Génesis","05/2020"));
      ArrayEstudiante.add(new Estudiante(2,"Vanessa","05/2020"));
       ArrayEstudiante.add(new Estudiante(3,"Homero","05/2020"));
        
        objLogClienteDB.InsertarClientes(ArrayEstudiante);
        
        //limpiando arrayList
        ArrayEstudiante = new ArrayList<Estudiante>();
       ArrayEstudiante.removeAll(ArrayEstudiante);
        
        objLogClienteDB.RecuperarClientes(ArrayEstudiante);
        
        for (Estudiante objCliente: ArrayEstudiante)
            System.out.println(objCliente.toString());
                    
                
    }
}
