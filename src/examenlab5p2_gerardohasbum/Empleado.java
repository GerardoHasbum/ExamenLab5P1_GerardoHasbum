/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_gerardohasbum;

import java.util.Date;

/**
 *
 * @author ghasb
 */
public class Empleado extends Usuarios{

    String carrera, puesto, RNP;

    public Empleado() {
    }

    public Empleado(String carrera, String puesto, String RNP, String nombre, String apellido, String password, String sexo, String departamento, String identidad, Date nacimiento) {
        super(nombre, apellido, password, sexo, departamento, identidad, nacimiento);
        this.carrera = carrera;
        this.puesto = puesto;
        this.RNP = RNP;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getRNP() {
        return RNP;
    }

    public void setRNP(String RNP) {
        this.RNP = RNP;
    }

    @Override
    public String toString() {
        return "Empleado:\n" + super.toString()+"\nCarrera: " + carrera + "\nPuesto: " + puesto + "\nRNP: " + RNP;
    }
    
    

}
