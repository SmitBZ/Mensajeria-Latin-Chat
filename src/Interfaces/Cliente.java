package Interfaces;

import CONEXION.SQLMensajes;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.InetAddress;

/**
 *
 * @author smit1
 */

public class Cliente {
    
    private InterfazGeneral interfaz;
    private Socket socket;
    private HiloCliente hiloCliente;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    
    public Cliente (InterfazGeneral interfaz){
        this.interfaz = interfaz;
    }
    
    public boolean conectar(String ip, String nombre){
        try{
            this.socket = new Socket(InetAddress.getByName(ip), 5000);
            this.output = new ObjectOutputStream(this.socket.getOutputStream());
            this.input = new ObjectInputStream(this.socket.getInputStream());
            this.output.writeObject(nombre);
            this.output.flush();
            this.hiloCliente = new HiloCliente(this.interfaz, this.input);
            this.hiloCliente.start();
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    public void enviar (String mensaje){
        try {
            this.output.writeObject(mensaje);
            this.output.flush();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
    
}
