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
public class Usuarios {

    String nombre, apellido, password, sexo, departamento, identidad;
    Date nacimiento;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String password, String sexo, String departamento, String identidad, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.sexo = sexo;
        this.departamento = departamento;
        this.identidad = identidad;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Nombre completo: " + nombre + " " + apellido + "\nPassword: " + password + "\nSexo: " + sexo + "\nDepartamento: " + departamento + "\nIdentidad: " + identidad + "\nFecha de nacimiento: " + nacimiento;
    }

}
