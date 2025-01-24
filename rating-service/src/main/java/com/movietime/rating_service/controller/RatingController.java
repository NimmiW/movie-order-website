package com.movietime.rating_service.controller;

import com.movietime.rating_service.model.Rating;
import com.movietime.rating_service.repository.RatingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private RatingRepository ratingRepository = new RatingRepository();

    @GetMapping
    public List<Rating> getAll(){
        return ratingRepository.getAll();
    }

    @PostMapping
    public Rating add(@RequestBody Rating rating) {
        return ratingRepository.add(rating);
    }

    @GetMapping("/{id}")
    public Rating getById(@PathVariable Long id) {
        return ratingRepository.findById(id);
    }
}