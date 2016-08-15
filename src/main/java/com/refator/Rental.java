package com.refator;

/**
 * chao.yu@dianping.com
 * Created by apple on 2016/08/15 18:33.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this.movie = _movie;
        this.daysRented = _daysRented;
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
