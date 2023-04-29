package Dao;

import Entidades.Vuelo;
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
public class VuelosDao {
    
    private String mensaje = "" ;
    
    public String agregarVuelo(Connection con , Vuelo vuel){
        
        int id = getMaxID(con);
        
        PreparedStatement pst = null;
        String sql = " BEGIN "
                + "insertar_vuelo(? , ? , ? , ? , ? , ? ); "
                + "END ;";
        
        
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            pst.setString(2, vuel.getNombre_vuelo());
            pst.setString(3, vuel.getOrigen());
            pst.setInt(4, vuel.getId_destino());
            pst.setInt(5, vuel.getId_avion());
            pst.setInt(6, vuel.getId_tipo_asiento());
            
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR \n" + e.getMessage() +"\n"
                    + e.getErrorCode();
        }
        
        return mensaje;
    }
    
    public String modificarVuelo(Connection con , Vuelo vuel){
        
        PreparedStatement pst = null;
        String sql = "UPDATE VUELOS SET NOMBRE_VUELO = ?, ORIGEN = ? , ID_DESTINO = ?, ID_AVION = ?, ID_TIPO_ASIENTO = ? "
                   + "WHERE ID_VUELO = ?" ;
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, vuel.getNombre_vuelo());
            pst.setString(2, vuel.getOrigen());
            pst.setInt(3, vuel.getId_destino());
            pst.setInt(4, vuel.getId_avion());
            pst.setInt(5, vuel.getId_tipo_asiento());
            
            pst.setInt(6,vuel.getId_vuelo());
            mensaje = "MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "NO SE PUDO MODIFICAR \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarVuelo(Connection con , int id){
        
         PreparedStatement pst = null;
         String sql = "DELETE FROM VUELOS WHERE ID_VUELO = ?" ;
        
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
    
    public void listarVuelo(Connection con, JTable tabla){
        
        DefaultTableModel model;
        String [] columnas = {"ID_VUELO","NOMBRE_VUELO","ORIGEN","ID_DESTINO","ID_AVION","ID_TIPO_ASIENTO"};
        model = new DefaultTableModel(null, columnas);
        
        String sql= "SELECT * FROM VUELOS ORDER BY ID_VUELO" ;
        
        String [] filas = new String [6];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i = 0; i < 6; i++) {
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
            pst = con.prepareStatement("select MAX(ID_VUELO)+1 AS ID FROM vuelos ");
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
