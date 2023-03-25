/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

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
    
     private void conectar(){
         
         try{
          Class.forName("oracle.jdbc.OracleDriver"); //driver
          url = "jdbc:oracle:thin:@localhost:1521:ORCL";
          user = "sys as sysdba";
          password = "oracle2023";
          conn = DriverManager.getConnection(url, user, password);
          System.out.println ("conectado");
         }catch (Exception e){
             System.out.println ("error al conectar");
         }
     }
         
     
     
     public void desconectar(){
         try {
             conn.close();
             System.out.println ("desconectado");
         }catch(Exception e){
             System.out.println ("error al desconectar");
         }
         
         
     }
    

     }