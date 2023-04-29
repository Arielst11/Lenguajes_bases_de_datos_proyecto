/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import conexion.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author fidelitas
 */
public class Reserva {

    public Reserva(int id_reserva, int id_vuelo, int precio_boleto, int cantidad_boletos, int id_cliente) {
        this.id_reserva = id_reserva;
        this.id_vuelo = id_vuelo;
        this.precio_boleto = precio_boleto;
        this.cantidad_boletos = cantidad_boletos;
        this.id_cliente = id_cliente;
    }
  
    
    
public int id_reserva;
public int id_vuelo;
public int precio_boleto;
public int cantidad_boletos;
public int id_cliente;



    public Reserva() {
    }

    
    public void ingresarReserva(){
    Conexion cn = new Conexion();
    cn.conectar();
    
PreparedStatement ps;
    // se prepara el statement.    
    try {
        ps = cn.getConn().prepareCall("insert into Reserva"
     + " (id_reserva ,id_vuelo,precio_boleto ,cantidad_boletos,id_cliente) values"
                + "(?,?,?,?,?)");
        
      ps.setString(1, String.valueOf(this.id_reserva));
      ps.setString(2, String.valueOf(this.id_vuelo));
      ps.setString(3, String.valueOf(this.precio_boleto));
      ps.setString(4, String.valueOf(this.cantidad_boletos));
      ps.setString(5, String.valueOf(this.id_cliente));
     
    
      if(ps.executeUpdate() >0){
          JOptionPane.showMessageDialog(null, "Reserva registrado");
      }
    }catch (Exception e){    
  JOptionPane.showMessageDialog(null, "error al ingresar Reserva");
    }
     cn.desconectar();
}

}
