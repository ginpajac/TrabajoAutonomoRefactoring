/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Couplers.InappropriateIntimacy.Refactoring;

/**
 *
 * @author Ginger Jacome
 */
public class NumeroTelefonico {
    private String officeAreaCode;
    private String officeNumber;

    public String getNumeroTelefonico() {
        return officeAreaCode+"-"+officeNumber;
    }

    public void setNumeroTelefonico(String officeAreaCode, String officeNum) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber= officeNum;
    }

    
    
}
