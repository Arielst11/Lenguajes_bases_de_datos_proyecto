package Entidades;

/**
 *
 * @author Luis Carlos
 */
public class Aerolinea {
    private int id_aerolinea;
    private String nombre_aerolinea;

    public Aerolinea() {
    }

    public Aerolinea(int id_aerolinea, String nombre_aerolinea) {
        this.id_aerolinea = id_aerolinea;
        this.nombre_aerolinea = nombre_aerolinea;
    }

    public String getNombre_aerolinea() {
        return nombre_aerolinea;
    }

    public void setNombre_aerolinea(String nombre_aerolinea) {
        this.nombre_aerolinea = nombre_aerolinea;
    }

    public int getId_aerolinea() {
        return id_aerolinea;
    }

    public void setId_aerolinea(int id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }

    @Override
    public String toString() {
        return "Aerolinea{" + "id_aerolinea=" + id_aerolinea + ", nombre_aerolinea=" + nombre_aerolinea + '}';
    }
    
    
}
