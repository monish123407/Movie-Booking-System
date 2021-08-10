package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.MovieDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.Movie;

import java.util.List;

public interface MovieService {
    public Movie acceptMovieDetails(Movie movie);
    public Movie getMovieDetails(int id) throws MovieDetailsNotFoundException;
    public Movie updateMovieDetails(int id, Movie movie) throws MovieDetailsNotFoundException;
    public boolean deleteMovie(int id) throws MovieDetailsNotFoundException ;
    public List<Movie> getAllMoviesDetails();
}
