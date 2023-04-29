package Bo;

import Dao.AvionesDao;
import Entidades.Avion;
import conexion.Conexion;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * @author Luis Carlos
 */
public class AvionesBO {
    
    private String mensaje = "";
    private AvionesDao avdao = new AvionesDao();
    
    Conexion conn1 = new Conexion();
    Connection conn = conn1.getConn();
    
    public String agregarAvion(Avion avi){
        
        try {
            mensaje = avdao.agregarAvion(conn, avi);
            
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
    public String modificarAvion(Avion avi){
        
        Connection conn = conn1.getConn();
        
        try {
            mensaje = avdao.modificarAvion(conn, avi);
            
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
    public String eliminarAvion(int id){
        Connection conn = conn1.getConn();
        
        try {
            mensaje = avdao.eliminarAvion(conn, id);
            
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
        public void listarAvion(JTable tabla){
        
        avdao.listarAvion(conn, tabla);
        
       
    }
    
    public int getMaxID(){
        int id = avdao.getMaxID(conn);
  
        return id;
    }
}