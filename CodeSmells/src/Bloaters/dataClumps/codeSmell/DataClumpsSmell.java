/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloaters.dataClumps.codeSmell;

import java.util.Scanner;

/**
 *
 * @author Ginger Jacome
 */
public class DataClumpsSmell {

    public static void main(String args[]) {
        String firstName = "Brew";
        String lastName = "Cobos";
        Integer age =24;
        String gender = "Masculino";
        String occupation = "Estudiante";
        String city = "Machala";
        welcomeNew(firstName, lastName, age, gender, occupation, city);
    }

    public static void welcomeNew(String firstName, String lastName, Integer age, String gender, String occupation, String city) {
        System.out.printf("Welcome %s %s, a %d-year-old %s from %s who works as a %s\n", firstName, lastName, age, gender, city, occupation);
    }
}
