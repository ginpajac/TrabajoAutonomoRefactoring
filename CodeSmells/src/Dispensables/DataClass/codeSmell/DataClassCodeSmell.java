/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispensables.DataClass.codeSmell;

/**
 *
 * @author Ginger Jacome
 */
public class DataClassCodeSmell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombres("Sheryl");
        empleado.setApellidos("Cobos");
        empleado.setCedula("1203116122");
        empleado.setSalario(500);
        
        System.out.println("Nombres; "+empleado.getNombres());
        System.out.println("Apellidos: "+empleado.getApellidos());
        System.out.println("Cedula: "+empleado.getCedula());
        System.out.println("Salario: "+empleado.getSalario());
        empleado.setSalario(empleado.getSalario()+24);
        System.out.println("Salario con aumento: "+empleado.getSalario());
        
    }
    
}
