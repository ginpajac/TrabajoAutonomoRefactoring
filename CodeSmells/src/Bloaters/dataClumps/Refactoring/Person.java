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
public class Person {

    String firstName;
    String lastName;
    Integer age;
    String gender;
    String occupation;
    String city;

    public Person(String firstName, String lastName, Integer age, String gender, String occupation, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.city = city;
    }

    public void welcomeNew() {
        System.out.printf("Welcome %s %s, a %d-year-old %s from %s who works as a%s\n", firstName, lastName, age, gender, city, occupation);
    }

    public void work() {
        System.out.printf("This is %s working hard on %s in %s\n", firstName, occupation, city);
    }

}
