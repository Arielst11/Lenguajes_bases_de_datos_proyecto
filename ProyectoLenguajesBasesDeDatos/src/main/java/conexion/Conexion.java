/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

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
public class Conexion {

   
    
    private Connection conn = null;
    private String url;
    private String user;
    private String password;

    public Conexion(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
     public Conexion() {
      conectar();
    }
    
      /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }
     public void conectar(){
         
         try{
          Class.forName("oracle.jdbc.OracleDriver"); //driver
          url = "jdbc:oracle:thin:@localhost:1521:ORCL";
          //user = "sys as sysdba";
          user = "HR";
          password = "oracle2023";
            setConn(DriverManager.getConnection(url, user, password));
          System.out.println ("conectado");
         }catch (Exception e){
             System.out.println ("error al conectar");
         }
         
     }
         
     
     public void desconectar(){
         try {
             getConn().close();
             System.out.println ("desconectado");
         }catch(Exception e){
             System.out.println ("hay un error al desconectar");
         }
         
         
     }
    
     
     

     
     
     }