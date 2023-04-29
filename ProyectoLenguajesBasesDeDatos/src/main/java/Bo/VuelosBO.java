package Bo;

import conexion.Conexion;
import Dao.VuelosDao;
import Entidades.Vuelo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Luis Carlos
 */
public class VuelosBO {
    
    private String mensaje = "" ;
    private VuelosDao vdao = new VuelosDao();
    
    Conexion conn1 = new Conexion();
    Connection conn = conn1.getConn();
    
    public String agregarVuelo(Vuelo vuel){
        
        try {
            mensaje = vdao.agregarVuelo(conn, vuel);
            
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
    
    public String modificarVuelo(Vuelo vuel){
        
        Connection conn = conn1.getConn();
        
        try {
            mensaje = vdao.modificarVuelo(conn, vuel);
            
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
    
    public String eliminarVuelo(int id){
        Connection conn = conn1.getConn();
        
        try {
            mensaje = vdao.eliminarVuelo(conn, id);
            
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
        
        vdao.listarVuelo(conn, tabla);
        
       
    }
    
    public int getMaxID(){
        int id = vdao.getMaxID(conn);
        
     
     
        return id;
    }
   
}
