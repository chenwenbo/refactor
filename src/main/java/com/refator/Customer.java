package com.refator;


import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0; //point
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for "+ getName() + "\n";
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();

            frequentRenterPoints += getFrequentRenterPoints(each);

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();
        }
        // add footer lines
        result += "Amount owed is" + String.valueOf(totalAmount) + "\n";
        result += "You earn" + String.valueOf(frequentRenterPoints) + "frequent renter points";
        return result;
    }

    private int getFrequentRenterPoints(Rental each) {
        if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1){
            return 2;
        }else{
            return 1;
        }
    }

}
