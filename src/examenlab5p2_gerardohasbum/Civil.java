package examenlab5p2_gerardohasbum;

import java.util.ArrayList;
import java.util.Date;

public class Civil extends Usuarios{
    
    public ArrayList<Tramites> tramites = new ArrayList();

    public Civil() {
    }

    public Civil(String nombre, String apellido, String password, String sexo, String departamento, String identidad, Date nacimiento) {
        super(nombre, apellido, password, sexo, departamento, identidad, nacimiento);
    }

    @Override
    public String toString() {
        return "Civil: \n" +super.toString()+ "\n\nTramites:\n" + tramites;
    }
    
    
    
}
