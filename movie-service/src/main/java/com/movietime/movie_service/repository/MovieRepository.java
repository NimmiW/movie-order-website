package com.movietime.movie_service.repository;

import com.movietime.movie_service.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {
    List<Movie> movieList = new ArrayList<>();

    private List<Movie> populateMovieList (){
        Movie movie1 = new Movie(Long.valueOf(1),"Titanic");
        Movie movie2 = new Movie(Long.valueOf(2),"Joker");
        Movie movie3 = new Movie(Long.valueOf(3),"Avatar");
        Movie movie4 = new Movie(Long.valueOf(4),"Peter Pan");
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        return movieList;
    }

    public MovieRepository() {
        this.movieList = populateMovieList();
    }

    public Movie add(Movie movie) {
        movieList.add(movie);
        return movie;
    }

    public List<Movie> getAll() {
        return movieList;
    }

    public Movie getById(Long id) {
        return movieList.stream()
                .filter(movie -> movie.getMovieId().equals(id))
                .findFirst()
                .orElseThrow();
    }


}
