/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloaters.largeClass.Refactoring;

/**
 *
 * @author Ginger Jacome
 */
public class NumeroTelefonico {
    private String codigoDeArea;
    private String telefonia;
    private String numeroTelefonicooficial;

    public NumeroTelefonico(String codigoDeArea, String telefonia, String numeroTelefonicooficial) {
        this.codigoDeArea = codigoDeArea;
        this.telefonia = telefonia;
        this.numeroTelefonicooficial = numeroTelefonicooficial;
    }

    public String getCodigoDeArea() {
        return codigoDeArea;
    }

    public void setCodigoDeArea(String codigoDeArea) {
        this.codigoDeArea = codigoDeArea;
    }

    public String getTelefonia() {
        return telefonia;
    }

    public void setTelefonia(String telefonia) {
        this.telefonia = telefonia;
    }

    public String getNumeroTelefonicooficial() {
        return numeroTelefonicooficial;
    }

    public void setNumeroTelefonicooficial(String numeroTelefonicooficial) {
        this.numeroTelefonicooficial = numeroTelefonicooficial;
    }
    
   
}
