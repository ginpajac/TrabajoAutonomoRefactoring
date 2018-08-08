package Dispensables.Comments.Refactoring;

/**
 *
 * @author Ginger Jacome
 */
public class Vector {

    private double coordX;
    private double coordY;

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

    public double magnitud() {
        return Math.sqrt(Math.pow(coordX, 2) + Math.pow(coordY, 2));
    }

    public double direccion() {
        return Math.atan2(coordX, coordY);
    }

    public static Vector escalarXVector(int e, Vector v) {
        Vector vec = new Vector(v.getCoordX() * e, v.getCoordY() * e);
        return vec;
    }

    public static double productoPunto(Vector v1, Vector v2) {
        double v = v1.getCoordX() * v2.getCoordX() + v1.getCoordY() * v2.getCoordY();
        return v;
    }

    @Override
    public String toString() {
        return "<" + coordX + "," + coordY + ">";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Vector)) {
            return false;
        }
        Vector v = (Vector) o;
        return (this.coordX == v.coordX && this.coordY == v.coordY);
    }

}
