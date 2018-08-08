/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientationAbusers.SwitchStatements.Refactoring;

/**
 *
 * @author Ginger Jacome
 */
public abstract class Grade {
    public char grade;
    public String message;

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "El alumno posee "+String.valueOf(this.grade)+"\n"+message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String Message) {
        this.message = Message;
    }
    
    
    
}
