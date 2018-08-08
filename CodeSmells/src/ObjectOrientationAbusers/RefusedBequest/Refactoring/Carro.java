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
public class Carro extends Vehiculo{

    public Carro() {
        super();
        setNombre("Car");
    }

    @Override
    protected void acelerar() {
        super.acelerar();
        System.out.println("Carro acelerando..");
    }
    
}
