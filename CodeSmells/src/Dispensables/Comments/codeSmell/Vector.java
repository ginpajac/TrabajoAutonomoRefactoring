/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispensables.Comments.codeSmell;

/**
 *
 * @author Ginger Jacome
 */
public class Vector {

    private double coordX; //coordenada x del vector
    private double coordY; //coordenada y del vector

    //constructor
    public Vector(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public double magnitud() { //Calcula lal magnitud de un vector
        return Math.sqrt(Math.pow(coordX, 2) + Math.pow(coordY, 2));
    }

    public double direccion() { //Caclcula la direccion del vector
        return Math.atan2(coordX, coordY);
    }

    public static Vector escalarXVector(int e, Vector v) { //Calcula el producto escalar del vector
        Vector vec = new Vector(v.getCoordX() * e, v.getCoordY() * e); // crea un nuevo vector
        return vec;
    }

    public static double productoPunto(Vector v1, Vector v2) { //Calcula el producto punto de dos vectores
        double v = v1.getCoordX() * v2.getCoordX() + v1.getCoordY() * v2.getCoordY();
        return v;
    }

    @Override
    public String toString() { //sobreescribe tostring
        return "<" + coordX + "," + coordY + ">";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Vector)) {
            return false; //Si el objeto es nulo o no es una instancia de vector
        }
        Vector v = (Vector) o;
        return (this.coordX == v.coordX && this.coordY == v.coordY);
    }

}
