/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispensables.DataClass.Refactoring;

/**
 *
 * @author Ginger Jacome
 */
public class Empleado {
    private String cedula;
    private String nombres;
    private String apellidos;
    private double salario;
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String nombreCompleto(){
        return nombres+" "+apellidos;
    }
    public double salarioAnual(){
        return 12*salario;
    }
    
    public void incremento(int inc){
        this.salario= salario+inc;
    }

    @Override
    public String toString() {
        return "Cedula: "+cedula+"\nNombres: "+nombres+"\nApellidos: "+apellidos+"\nSalario: "+salario;
    }

    
}