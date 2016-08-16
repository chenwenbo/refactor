package com.refator.chapter1;


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

    public String htmlStatement(){
        Enumeration rentals = _rentals.elements();
        String result = "<H1>Rental Record for <EM>"+ getName() + "</EM></H1>\n";
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }
        // add footer lines
        result += "<P>Amount owed is<EM>" + String.valueOf(getTotalCharge()) + "</EM></P>\n";
        result += "<P>You earn<EM>" + String.valueOf(getFrequentRenterPoints()) + "frequent renter points</EM></P>";
        return result;
    }

    public String statement(){
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for "+ getName() + "\n";
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
        // add footer lines
        result += "Amount owed is" + String.valueOf(getTotalCharge()) + "\n";
        result += "You earn" + String.valueOf(getFrequentRenterPoints()) + "frequent renter points";
        return result;
    }

    private int getFrequentRenterPoints(){
        int frequentRenterPoints = 0; //point
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    private double getTotalCharge(){
        double totalAmount = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }

}
