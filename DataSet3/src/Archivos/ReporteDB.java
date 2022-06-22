
package Archivos;

import Clases.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ReporteDB {
      DATConexion con = new DATConexion();
    ResultSet rs;
    PreparedStatement ps = null;
    public boolean InsertarEstudiante(Estudiante estudiante) {
        String sql = "INSERT INTO Reporte (materia, bimestre1 ,bimestre2,promedio) "  + "VALUES (?,?,?,?)";
        try {
            ps = con.AbrirConexion().prepareStatement(sql);
            //ps.setInt(1, objCliente.getId());
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getCarrera());
            ps.execute();
            //System.out.println("Cliente insertado");
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(3);
            }
        } 
    }

    public ResultSet RecuperarEstudiante() throws ClassNotFoundException, SQLException {
        java.sql.Statement st = con.AbrirConexion().createStatement();
        String sentencia = "SELECT * FROM tarea ";
        rs = st.executeQuery(sentencia);
        return rs;
    }
}
