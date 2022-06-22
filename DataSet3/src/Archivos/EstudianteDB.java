package Archivos;
import Clases.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class EstudianteDB {
    DATConexion con = new DATConexion();
    ResultSet rs;
    PreparedStatement ps = null;
    public boolean InsertarEstudianteDB(Estudiante estudiante) {
        String sql = "INSERT INTO Estudiante (nombre, fecNac ) "  + "VALUES (?,?)";
        try {
            ps = con.AbrirConexion().prepareStatement(sql);
            //ps.setInt(1, objCliente.getId());
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getFecNac());
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

    public ResultSet RecuperarCliente() throws ClassNotFoundException, SQLException {
        java.sql.Statement st = con.AbrirConexion().createStatement();
        String sentencia = "SELECT * FROM Cliente";
        rs = st.executeQuery(sentencia);
        return rs;
    }

    
    
}
