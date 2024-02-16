package examenlab5p2_gerardohasbum;

public class Tramites {

    String nombre, tramite;

    public Tramites() {
    }

    public Tramites(String nombre, String tramite) {
        this.nombre = nombre;
        this.tramite = tramite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    @Override
    public String toString() {
        return "Tramites de " + nombre + ":\n\n Tramite: " + tramite;
    }    
    
}
