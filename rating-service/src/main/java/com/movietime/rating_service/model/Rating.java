package com.movietime.rating_service.model;

public class Rating {
    private Long ratingId;
    private Long movieId;
    private String review;

    public Rating(){

    }

    public Rating(Long ratingId, Long movieId, String review) {
        this.ratingId = ratingId;
        this.movieId = movieId;
        this.review = review;
    }

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
