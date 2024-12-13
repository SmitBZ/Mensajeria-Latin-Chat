/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mySql;
import CONEXION.Conexion;
import Interfaces.Servidor;

/**
 *
 * @author smit1
 */
public class Conexion_mySql {
    public static void main(String args[]){
        Conexion app = new Conexion();
        app.getConexion();
    }
}
