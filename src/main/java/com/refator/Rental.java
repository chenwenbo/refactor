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
        return movie.getFrequentRenterPoints(daysRented);
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
