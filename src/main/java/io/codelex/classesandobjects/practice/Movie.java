package io.codelex.classesandobjects.practice;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String movieTitle, String movieStudio, String movieRating) { // constructor for non-PG13 movies.
        this.title = movieTitle;
        this.studio = movieStudio;
        this.rating = movieRating;
    }

    public Movie(String movieTitle, String movieStudio) { // constructor for PG13 movies.
        this.title = movieTitle;
        this.studio = movieStudio;
        this.rating = "PG13";
    }

    public static void main(String[] args) {

        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions");
        Movie Glass = new Movie("Glass", "Buena Vista International");
        Movie spiderManSpiderVerse = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");
    }

    public static Movie[] getPG(Movie[] movies) {
        ArrayList<Movie> moviesPG = new ArrayList<>();
        for (Movie movie : movies) {
            if ("PG13".equals(movie.rating) || "PG".equals(movie.rating)) {
                moviesPG.add(movie);
            }
        }

        return moviesPG.toArray(new Movie[0]); // returns PG13 movies in a new array of objects.
    }
}
