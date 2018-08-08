/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloaters.primitiveObsession.codeSmell;

/**
 *
 * @author Ginger Jacome
 */
public class primitiveObsession {

    public static void main(String args[]) {

        Integer[] cityPopulations = {
            13000000, // London
            21903623, // New York
            12570000, // Tokyo
            1932763, // Stockholm
            1605602, // Barcelona
            4119190 // Sydney
        };

        for (Integer cityPopulation : cityPopulations) {

            System.out.println(cityPopulation);
        }

    }

}
