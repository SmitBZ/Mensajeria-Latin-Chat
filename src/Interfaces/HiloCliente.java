package Interfaces;

import java.io.IOException;
import java.io.ObjectInputStream;

public class HiloCliente extends Thread {
    private ObjectInputStream input;
    private InterfazGeneral cliente;
    private boolean activo = true;

    public HiloCliente (InterfazGeneral cliente, ObjectInputStream input){
        this.cliente = cliente;
        this.input = input;
    }
    public void run (){
        while (this.activo){
            String mensaje;
            try {
                mensaje = (String)this.input.readObject();
                this.cliente.getAreatexto().append(mensaje + "\n");
            }catch (IOException exception){
                this.activo = false;
            }catch (ClassNotFoundException exception){
                exception.printStackTrace();
            }
        }
    }
}
