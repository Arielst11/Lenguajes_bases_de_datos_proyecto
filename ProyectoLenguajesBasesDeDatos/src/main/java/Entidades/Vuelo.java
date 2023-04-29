
package Entidades;

/**
 *
 * @author Luis Carlos
 */
public class Vuelo {
    
    private int id_vuelo;
    private String nombre_vuelo;
    private String origen;
    private int id_destino;
    private int id_avion;
    private int id_tipo_asiento;
    

    public Vuelo() {
    }

    public Vuelo(int id_vuelo, String nombre_vuelo, String origen, int id_destino, int id_avion, int id_tipo_asiento, String fecha_vuelos) {
        this.id_vuelo = id_vuelo;
        this.nombre_vuelo = nombre_vuelo;
        this.origen = origen;
        this.id_destino = id_destino;
        this.id_avion = id_avion;
        this.id_tipo_asiento = id_tipo_asiento;
        
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id_vuelo=" + id_vuelo + ", nombre_vuelo=" + nombre_vuelo + ", origen=" + origen + ", id_destino=" + id_destino + ", id_avion=" + id_avion + ", id_tipo_asiento=" + id_tipo_asiento + '}';
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public String getNombre_vuelo() {
        return nombre_vuelo;
    }

    public void setNombre_vuelo(String nombre_vuelo) {
        this.nombre_vuelo = nombre_vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getId_destino() {
        return id_destino;
    }

    public void setId_destino(int id_destino) {
        this.id_destino = id_destino;
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public int getId_tipo_asiento() {
        return id_tipo_asiento;
    }

    public void setId_tipo_asiento(int id_tipo_asiento) {
        this.id_tipo_asiento = id_tipo_asiento;
    }


    
}
