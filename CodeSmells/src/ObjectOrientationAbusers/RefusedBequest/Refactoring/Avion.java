/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientationAbusers.RefusedBequest.Refactoring;


/**
 *
 * @author Ginger Jacome
 */
public class Avion extends Vehiculo {

    public Avion() {
        super();
        setNombre("plane");
    }
     protected void volar() {
        System.out.println("Volando...");
    }
}
