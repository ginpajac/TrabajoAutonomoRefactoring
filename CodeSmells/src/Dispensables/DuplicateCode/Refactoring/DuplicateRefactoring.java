/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispensables.DuplicateCode.Refactoring;

/**
 *
 * @author Ginger Jacome
 */
public class DuplicateRefactoring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array_a[] = {1, 2, 3};
        int array_b[] = {4, 5, 6};
        System.out.println("Promedio de a: " + promedio(array_a));
        System.out.println("Promedio de b: " + promedio(array_b));
    }
    public static int promedio(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];

        return sum /array.length;
    }
}
