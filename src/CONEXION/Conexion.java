package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author smit1
 */

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/latin_chat";
    public static final String USER = "root";
    public static final String CLAVE = "12345";
     
    public static Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
            System.out.print("Se conecto con la base de datos");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se conectó correctamente a la base de datos");
        }
        return con;
    }
  
}
