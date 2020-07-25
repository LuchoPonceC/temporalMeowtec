package com.example.meowtecfinal.model;

public class Model{

    private int movieImage;
    private String movieTitle;
    private String aboutMovie;

    Model(int movieImage, String movieTitle, String aboutMovie) {
        this.movieImage = movieImage;
        this.movieTitle = movieTitle;
        this.aboutMovie = aboutMovie;
    }



    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getAboutMovie() {
        return aboutMovie;
    }

    public void setAboutMovie(String aboutMovie) {
        this.aboutMovie = aboutMovie;
    }
}
