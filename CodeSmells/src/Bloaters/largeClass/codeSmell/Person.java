/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloaters.largeClass.codeSmell;

/**
 *
 * @author Ginger Jacome
 */
public class Person {

    private String nombre;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String codigoDeArea;
    private String telefonia;
    private String numeroTelefonicooficial;

    public Person(String nombre, String apellidos, String cedula, String direccion, String codigoDeArea, String telefonia, String numeroTelefonico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.codigoDeArea = codigoDeArea;
        this.telefonia = telefonia;
        this.numeroTelefonicooficial = numeroTelefonico;
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

    public String getCodigoDeArea() {
        return codigoDeArea;
    }

    public void setCodigoDeArea(String codigoDeArea) {
        this.codigoDeArea = codigoDeArea;
    }

    public String getTelefonia() {
        return telefonia;
    }

    public void setTelefonia(String telefonia) {
        this.telefonia = telefonia;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonicooficial;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonicooficial = numeroTelefonico;
    }
   
    
}
