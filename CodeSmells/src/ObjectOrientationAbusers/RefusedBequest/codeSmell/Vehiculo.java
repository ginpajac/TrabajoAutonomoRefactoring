/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientationAbusers.RefusedBequest.codeSmell;

/**
 *
 * @author Ginger Jacome
 */
public class Vehiculo {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void acelerar() {
        System.out.println("Acelerar...");
    }

    protected void volar() {
        System.out.println("Volando...");
    }
}
