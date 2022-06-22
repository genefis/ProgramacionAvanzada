package Archivos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Génesis González
 * Fecha:21/Junio/2022
 */
public class DATConexion {
    //Conectarse a la BDD
    public Connection con;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/tarea";
        System.out.println("llego");
        Class.forName(driver);
        return DriverManager.getConnection(url, "root","");
    }

    public Connection AbrirConexion() throws ClassNotFoundException, SQLException {
        con = getConnection();
        return con;
    }

    public void CerrarConexion() throws SQLException {
        con.close();
    }
}
