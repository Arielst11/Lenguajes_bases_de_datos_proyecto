package Dao;

import Entidades.Avion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luis Carlos
 */
public class AvionesDao {
    
    private String mensaje = "" ;
 
    public String agregarAviones(Connection con, Avion avi) {
        
        return mensaje;
        
        
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
