/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Couplers.InappropriateIntimacy.codeSmell;

/**
 *
 * @author Ginger Jacome
 */
public class Persona {
    
    private String nombre;
    private String officeAreaCode;
    private String officeNumber;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getNumeroTelefonico() {
        return  officeAreaCode + "-" + officeNumber;
    }

    public void setNumeroTelefonico(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }
    
}
