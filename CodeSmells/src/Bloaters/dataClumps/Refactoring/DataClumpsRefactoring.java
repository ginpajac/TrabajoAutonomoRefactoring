/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloaters.dataClumps.Refactoring;

/**
 *
 * @author Ginger Jacome
 */
public class DataClumpsRefactoring {

    public static void main(String args[]) {
        String firstName = "Brew";
        String lastName = "Cobos";
        Integer age = 24;
        String gender = "Masculino";
        String occupation = "Estudiante";
        String city = "Machala";

        Person joe = new Person(firstName, lastName, age, gender, occupation, city);
        joe.welcomeNew();
        joe.work();

    }
}
