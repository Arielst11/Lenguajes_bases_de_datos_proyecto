/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author fidelitas
 */
public class Cliente {
    
public Cliente(int id, String nombre_cliente, String correo_cliente, int telefono_cliente, String direccion, int id_pais) {
        this.id_cliente = id;
        this.nombre_cliente = nombre_cliente;
        this.correo_cliente = correo_cliente;
        this.telefono_cliente = telefono_cliente;
        this.direccion = direccion;
        this.id_pais = id_pais;
    }

    public Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente() {
    }

private int id_cliente;   
private String nombre_cliente;
private String correo_cliente;
private int telefono_cliente;
private String direccion;
private int id_pais;



public void ingresarCliente(){
    Conexion cn = new Conexion();
    cn.conectar();
    
PreparedStatement ps;
    // se prepara el statement.    
    try {
        ps = cn.getConn().prepareCall("insert into Cliente"
     + " (id_cliente,nombre_cliente, correo_cliente,telefono_cliente,direccion,id_pais) values"
                + "(?,?,?,?,?,?)");
        
      ps.setString(1, String.valueOf(this.id_cliente));
      ps.setString(2, this.nombre_cliente);
      ps.setString(3, this.correo_cliente);
      ps.setString(4, String.valueOf(this.telefono_cliente));
      ps.setString(5, this.direccion);
      ps.setString(6, String.valueOf(this.id_pais));
    
      if(ps.executeUpdate() >0){
          JOptionPane.showMessageDialog(null, "Cliente registrado");
      }
    }catch (Exception e){    
  JOptionPane.showMessageDialog(null, "error al ingresar Cliente");
    }
     cn.desconectar();
}

public void modificarCliente(){
     Conexion cn = new Conexion();
    cn.conectar();
    
PreparedStatement ps;
    // se prepara el statement.    
    try {
        /*
        ps = cn.conn.prepareCall("insert into Cliente"
     + " (id_cliente,nombre_cliente, correo_cliente,telefono_cliente,direccion,id_pais) values"
                + "(?,?,?,?,?,?)");
        */
        ps = cn.getConn().prepareStatement("Update Cliente set "
                + "nombre_cliente = ?,"
                + "correo_cliente = ?,"
                + "telefono_cliente = ?,"
                + "direccion = ?,"
                + "id_pais = ?"
                + "where id_cliente = ?");
      ps.setString(1, this.nombre_cliente);
      ps.setString(2, this.correo_cliente);
      ps.setString(3, String.valueOf(this.telefono_cliente));
      ps.setString(4, this.direccion);
      ps.setString(5, String.valueOf(this.id_pais));
      ps.setString(6, String.valueOf(this.id_cliente));
    
      if(ps.executeUpdate() >0){
          JOptionPane.showMessageDialog(null, "Cliente actualizado");
      }
    }catch (SQLException ex){  
  //  Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE,null,ex);
  JOptionPane.showMessageDialog(null, "error al actualizar Cliente");
    }
     cn.desconectar();
}


public void borrarCliente(){
    Conexion cn = new Conexion();
    cn.conectar();
    
PreparedStatement ps;
    // se prepara el statement.    
    try {
        ps = cn.getConn().prepareCall("Delete from Cliente where id_cliente = ?");
        
      ps.setString(1, String.valueOf(this.id_cliente)); 
      if(ps.executeUpdate() >0){
          JOptionPane.showMessageDialog(null, "Cliente Eliminado");
      }
    }catch (Exception e){    
  JOptionPane.showMessageDialog(null, "error al eliminar Cliente");
    }
     cn.desconectar();
}
    /**
     * @return the nombre_cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    /**
     * @param nombre_cliente the nombre_cliente to set
     */
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    /**
     * @return the correo_cliente
     */
    public String getCorreo_cliente() {
        return correo_cliente;
    }

    /**
     * @param correo_cliente the correo_cliente to set
     */
    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    /**
     * @return the telefono_cliente
     */
    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    /**
     * @param telefono_cliente the telefono_cliente to set
     */
    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the id_pais
     */
    public int getId_pais() {
        return id_pais;
    }

    /**
     * @param id_pais the id_pais to set
     */
    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    

    
    
    
}
