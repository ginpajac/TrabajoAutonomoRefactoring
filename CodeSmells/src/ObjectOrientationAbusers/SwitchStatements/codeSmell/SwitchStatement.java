/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientationAbusers.SwitchStatements.codeSmell;

/**
 *
 * @author Ginger Jacome
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        opcion('C');
    }
    public static void opcion(char grade){
        switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :
             System.out.println("Excellentx2!"); 
            break;
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
    }
    
}
