package com.movietime.rating_service.repository;

import com.movietime.rating_service.model.Rating;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RatingRepository {

    List<Rating> ratingList = new ArrayList<>();

    private List<Rating> populateRatingsList (){
        Rating rating1 = new Rating(Long.valueOf(1),Long.valueOf(1), "Amazing");
        Rating rating2 = new Rating(Long.valueOf(2),Long.valueOf(2), "Very bad");
        Rating rating3 = new Rating(Long.valueOf(3),Long.valueOf(1), "Wow, I liked it");
        Rating rating4 = new Rating(Long.valueOf(4),Long.valueOf(2), "Well....;)");
        Rating rating5 = new Rating(Long.valueOf(5),Long.valueOf(1), "Boring one! dont watch it");
        ratingList.add(rating1);
        ratingList.add(rating2);
        ratingList.add(rating3);
        ratingList.add(rating4);
        ratingList.add(rating5);
        return ratingList;
    }

    public RatingRepository() {
        this.ratingList = populateRatingsList();
    }

    public Rating add(Rating rating) {
        ratingList.add(rating);
        return rating;
    }

    public List<Rating> getAll() {
        return ratingList;
    }

    public Rating findById(Long id) {
        return ratingList.stream()
                .filter(rating -> rating.getRatingId().equals(id))
                .findFirst()
                .orElseThrow();
    }
}
