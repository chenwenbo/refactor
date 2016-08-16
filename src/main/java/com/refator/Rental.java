package com.refator;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this.movie = _movie;
        this.daysRented = _daysRented;
    }

    double getCharge(){
       return movie.getCharge(daysRented);
    }

    int getFrequentRenterPoints() {
        if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1){
            return 2;
        }else{
            return 1;
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }
}
