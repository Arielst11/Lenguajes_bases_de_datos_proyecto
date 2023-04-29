package Entidades;

/**
 *
 * @author Luis Carlos
 */
public class Avion {
    private int id_avion;
    private int id_aerolinea;
    private String modelo_avion;
    private int capacidad_pasajeros;

    public Avion(int id_avion, int id_aerolinea, String modelo_avion, int capacidad_pasajeros) {
        this.id_avion = id_avion;
        this.id_aerolinea = id_aerolinea;
        this.modelo_avion = modelo_avion;
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public Avion() {
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public int getId_aerolinea() {
        return id_aerolinea;
    }

    public void setId_aerolinea(int id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }

    public String getModelo_avion() {
        return modelo_avion;
    }

    public void setModelo_avion(String modelo_avion) {
        this.modelo_avion = modelo_avion;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    @Override
    public String toString() {
        return "Avion{" + "id_avion=" + id_avion + ", id_aerolinea=" + id_aerolinea + ", modelo_avion=" + modelo_avion + ", capacidad_pasajeros=" + capacidad_pasajeros + '}';
    }
    
    
}
