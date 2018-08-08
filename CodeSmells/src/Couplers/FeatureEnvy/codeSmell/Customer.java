/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Couplers.FeatureEnvy.codeSmell;

/**
 *El cliente entra en los datos del teléfono para formatear el número
 * @author Ginger Jacome
 */
public class Customer {

    private Phone mobilePhone;

    public String getMobilePhoneNumber() {
        return "("
                + mobilePhone.getAreaCode() + ") "
                + mobilePhone.getPrefix() + "-"
                + mobilePhone.getNumber();
    }
}
