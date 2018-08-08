package Bloaters.longMethod.Refactoring;

import Bloaters.longMethod.codeSmell.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * Esta clase contiene el método Statement() el cual es demasiado largo al
 * contar con 30 líneas de código, por lo que se procedió a mover este código a
 * un nuevo método diferente y se reemplazó el código anterior con una llamada
 * al método nuevo
 *
 * @author Ginger Jacome
 */

public class Customer {

    /**
     * @uml.property name="_name"
     */
    private String _name;
    /**
     * @uml.property name="_rentals"
     * @uml.associationEnd multiplicity="(0 -1)" elementType="Rental"
     */
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        rent(rentals, frequentRenterPoints, totalAmount, result);
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private void rent(Enumeration rentals, int frequentRP, double totalAmount, String result) {
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            double thisAmount = amountFor(rental);
            frequentRP = frequencyRP(frequentRP, rental);
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
    }

    private int frequencyRP(int frequentRP, Rental rental) {
        if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
            frequentRP += 2;
        } else {
            frequentRP++;
        }
        return frequentRP;
    }

    private double amountFor(Rental aRental) {
        return getCharge(aRental);
    }

    public double getCharge(Rental aRental) {
        double result = 0;
        switch (aRental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (aRental.getDaysRented() > 2) {
                    result += (aRental.getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += aRental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (aRental.getDaysRented() > 3) {
                    result += (aRental.getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }
}
