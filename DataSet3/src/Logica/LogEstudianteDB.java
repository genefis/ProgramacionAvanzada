
package Logica;

import Archivos.EstudianteDB;
import Clases.Estudiante;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @Génesis González
 */
public class LogEstudianteDB {
    EstudianteDB objClienteDB = new EstudianteDB();

    public void InsertarClientes(ArrayList<Estudiante> ArrayClientes) {
        for(Estudiante objCliente:ArrayClientes)
              objClienteDB.InsertarEstudianteDB(objCliente);
    }

    public void RecuperarClientes(ArrayList<Estudiante> ArrayClientes) throws ClassNotFoundException, SQLException {
        ResultSet rs = objClienteDB.RecuperarCliente();
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columnas = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columnas.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) {
            Estudiante objAux = new Estudiante();
            for (String columnName : columnas) {
                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    objAux.setCod(Integer.parseInt(value));
                }
                if (columnName.equals("nombre")) {
                    objAux.setNombre(value);
                }
                if (columnName.equals("fecNac")) {
                    objAux.setFecNac(value);
                }
            }
            ArrayClientes.add(objAux);
        }
        ///return ArrayClientes;
    }
    
}
