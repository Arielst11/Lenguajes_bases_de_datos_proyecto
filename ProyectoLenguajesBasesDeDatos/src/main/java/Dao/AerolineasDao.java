package Dao;

import Entidades.Aerolinea;
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
public class AerolineasDao {
    
    private String mensaje = "";
    
    public String agregarAerolinea(Connection con, Aerolinea Aero) {
        
        int id = getMaxID(con);
        
        PreparedStatement pst = null;
        String sql = "BEGIN "
                + "agregar_aerolinea(?,?); "
                + "END;";
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, Aero.getNombre_aerolinea());
            
            mensaje = "AEROLINEA AGREGADA CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR \n" + e.getMessage() +"\n"
                    + e.getErrorCode();
        }
        
        return mensaje;
    }
    
    public String modificarAerolinea(Connection con , Aerolinea Aero){
        
        PreparedStatement pst = null;
        String sql = "UPDATE AEROLINEA SET NOMBRE_AEROLINEA = ? "
                   + "WHERE ID_AEROLINEA = ?" ;
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,Aero.getNombre_aerolinea());
            
            pst.setInt(2, Aero.getId_aerolinea());
           
            mensaje = "AEROLINEA MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO MODIFICAR \n" + e.getMessage();
        }
        return mensaje;
    }
    
     public String eliminarAerolinea(Connection con , int id){
        
         PreparedStatement pst = null;
         String sql = "DELETE FROM AEROLINEA WHERE ID_AEROLINEA = ?" ;
        
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
     
     public void listarAerolinea(Connection con, JTable tabla){
        
        DefaultTableModel model;
        String [] columnas = {"ID_AEROLINEA","NOMBRE_AEROLINEA"};
        model = new DefaultTableModel(null, columnas);
        
        String sql= "SELECT * FROM AEROLINEA ORDER BY ID_AEROLINEA" ;
        
        String [] filas = new String [2];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 2; i++) {
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
            pst = con.prepareStatement("select MAX(ID_AEROLINEA)+1 AS ID FROM aerolinea ");
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
