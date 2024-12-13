package CONEXION;

import Interfaces.InterfazGeneral;
import Interfaces.Logeo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author smit1
 */

public class SQLIdentifacion {
   
   Connection conexion;
   PreparedStatement sen;
   ResultSet resultado;
   String sql;
   InterfazGeneral inf = new InterfazGeneral();
   
   public void connLogin(String usuario, String password){
       try{
           conexion = Conexion.getConexion();
           
           sql = "SELECT usuario, password FROM usuario WHERE usuario = ? AND password = ? ";
           sen = conexion.prepareStatement(sql);
           sen.setString(1, usuario);
           sen.setString(2, password);
           
           resultado = sen.executeQuery();
           
           if(resultado.next()){
              usuario = resultado.getString("usuario");
              password = resultado.getString("password");
               
              inf.setVisible(true);
           }else{
               JOptionPane.showMessageDialog(null, "Error en Usuario o Contraseña");
           }
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null, "Usuario no encontrado");
       }finally{
          try {
            if (resultado != null) {
                resultado.close();
            }
            if (sen != null) {
                sen.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
       }
   }
}
