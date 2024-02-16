package examenlab5p2_gerardohasbum;

import java.util.Date;

public class Tramites {

    String nombre, tramite;
    Date envio;

    public Tramites() {
    }

    public Tramites(String nombre, String tramite, Date envio) {
        this.nombre = nombre;
        this.tramite = tramite;
        this.envio = envio;
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

    public Date getEnvio() {
        return envio;
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }

    

    @Override
    public String toString() {
        return "Tramites de " + nombre + ":\n\n Tramite: " + tramite+"\nFecha de envio: "+envio;
    }    
    
}
