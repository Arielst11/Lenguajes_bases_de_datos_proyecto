package Bo;

import Dao.AerolineasDao;
import Entidades.Aerolinea;
import conexion.Conexion;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * @author Luis Carlos
 */
public class AerolineasBO {
    
    private String mensaje = "";
    private AerolineasDao adao = new AerolineasDao();
    
    Conexion conn1 = new Conexion();
    Connection conn = conn1.getConn();
    
    public String agregarAerolinea(Aerolinea Aero){
        
        try {
            mensaje = adao.agregarAerolinea(conn, Aero);
            
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if (conn !=null) {
                    
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarAerolinea(Aerolinea Aero){
        
        Connection conn = conn1.getConn();
        
        try {
            mensaje = adao.modificarAerolinea(conn, Aero);
            
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if (conn !=null) {
                    
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public String eliminarAerolinea(int id){
        Connection conn = conn1.getConn();
        
        try {
            mensaje = adao.eliminarAerolinea(conn, id);
            
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if (conn !=null) {
                    
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public void listarVuelo(JTable tabla){
        
        adao.listarAerolinea(conn, tabla);
        
       
    }
    
    public int getMaxID(){
        int id = adao.getMaxID(conn);
        
     
     
        return id;
    }
    
}
