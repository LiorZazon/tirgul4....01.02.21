package com.company;

import lombok.ToString;

@ToString


public class Movie {
    public final String movieName;
    public final double releaseDate;
     public float score;
     public String genre;

     public static int movieCounter = 0; // שדה שבו יספרו כמות הספרים שנוצרו
     public static final int ratingForOscar = 9; //הציון הנדרש כדי לזכות באוסקר

    // function

    public static int resetCounter () {
        return movieCounter = 0;
    }

    public boolean isWonOscar() {
        if (score >= ratingForOscar) {
        }
        return isWonOscar();
    }
    public Movie(String movieName, double releaseDate, float score, String genre) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.score = score;
        this.genre = genre;
    }
}
