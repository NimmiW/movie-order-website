package com.movietime.movie_service.model;

public class Movie {
    private Long movieId;
    private String title;

    public Movie(){

    }

    public Movie(Long movieId, String title) {
        this.movieId = movieId;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
