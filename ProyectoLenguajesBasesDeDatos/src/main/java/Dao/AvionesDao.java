package Dao;

import Entidades.Avion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Carlos
 */
public class AvionesDao {
    
    private String mensaje = "" ;
 
    public String agregarAvion(Connection con, Avion avi) {
        
        int id = getMaxID(con);
        
        PreparedStatement pst = null;
        String sql = " BEGIN " 
                    + "agregar_avion(?, ?, ?, ?);" 
                    + "END ;";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setInt(2, avi.getId_aerolinea());
            pst.setString(3, avi.getModelo_avion());
            pst.setInt(4, avi.getCapacidad_pasajeros());
            
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
             mensaje = "NO SE PUDO GUARDAR \n" + e.getMessage() +"\n"
                    + e.getErrorCode();
        }
        
        return mensaje;
                
    }
     public String modificarAvion(Connection con , Avion avi){
        
        PreparedStatement pst = null;
        String sql = "UPDATE AVION SET ID_AEROLINEA = ?, MODELO_AVION = ? , CAPACIDAD_PASAJEROS = ?"
                   + "WHERE ID_AVION = ?" ;
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, avi.getId_aerolinea());
            pst.setString(2, avi.getModelo_avion());
            pst.setInt(3, avi.getCapacidad_pasajeros());
            
            pst.setInt(4, avi.getId_avion());
            mensaje = "MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO MODIFICAR \n" + e.getMessage();
        }
        return mensaje;
    }
     
     public String eliminarAvion(Connection con , int id){
        
         PreparedStatement pst = null;
         String sql = "DELETE FROM AVION WHERE ID_AVION = ?" ;
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO ELIMINAR \n" + e.getMessage();
        }
        
        return mensaje;
    }
     public void listarAvion(Connection con, JTable tabla){
        
        DefaultTableModel model;
        String [] columnas = {"ID_AVION","ID_AEROLINEA","MODELO_AVION","CAPACIDAD_PASAJEROS"};
        model = new DefaultTableModel(null, columnas);
        
        String sql= "SELECT * FROM AVION ORDER BY ID_AVION" ;
        
        String [] filas = new String [4];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 4; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }
    
       public int getMaxID(Connection con){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = con.prepareStatement("select MAX(ID_AVION)+1 AS ID FROM AVION ");
            rs = pst.executeQuery();
            if (rs.next()) {
                    id = rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error al mostrar id " + e.getMessage());
        }

        return id;
    }
    
}

