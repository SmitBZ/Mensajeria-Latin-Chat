
package CONEXION;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author smit1
 */
public class SQLMensajes {
    public static void mensajes(String contenido, String remitente){
        String sql = "INSERT INTO mensaje (contenido, fecha, remitente) VALUES (?, NOW(), ?)";
        try{
            Connection connection = Conexion.getConexion();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, contenido);
            statement.setString(2, remitente);

            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
            // Puedes manejar la excepción según tus necesidades (por ejemplo, mostrar un mensaje de error)
        }
    }
}
