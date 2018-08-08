/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloaters.largeClass.Refactoring;

/**
 *
 * @author Ginger Jacome
 */
public class Person {

    private String nombre;
    private String apellidos;
    private String cedula;
    private String direccion;
    private NumeroTelefonico numTelef;

    public Person(String nombre, String apellidos, String cedula, String direccion, NumeroTelefonico numTelef) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.numTelef = numTelef;
    }

    public NumeroTelefonico getNumTelef() {
        return numTelef;
    }

    public void setNumTelef(NumeroTelefonico numTelef) {
        this.numTelef = numTelef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
