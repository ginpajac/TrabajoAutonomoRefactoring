/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispensables.DuplicateCode.codeSmell;

/**
 *
 * @author Ginger Jacome
 */
public class DuplicateCodeSmell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array_a[] = {1, 2, 3};
        int array_b[] = {4, 5, 6};

        int sum_a = 0;

        for (int i = 0; i < array_a.length; i++) {
            sum_a += array_a[i];
        }

        int promedio_a = sum_a /array_a.length;

        int sum_b = 0;

        for (int i = 0; i < array_b.length; i++) {
            sum_b += array_b[i];
        }

        int promedio_b = sum_b / array_b.length;

        System.out.println("Promedio de a: " + promedio_a);
        System.out.println("Promedio de b: " + promedio_b);
    }

}
