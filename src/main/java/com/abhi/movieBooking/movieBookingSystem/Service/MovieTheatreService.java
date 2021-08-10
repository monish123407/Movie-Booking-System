package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.MovieDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.Exceptions.MovieTheatreDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.Exceptions.TheatreDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.MovieTheatre;

import java.util.List;

public interface MovieTheatreService {
    public MovieTheatre acceptMovieTheatreDetails(MovieTheatre movieTheatre) throws MovieDetailsNotFoundException,
            TheatreDetailsNotFoundException;
    public MovieTheatre getMovieTheatreDetails(int id) throws MovieTheatreDetailsNotFoundException;
    public boolean deleteMovieTheatre(int id) throws MovieTheatreDetailsNotFoundException;
    public List<MovieTheatre> getAllMovieTheatreDetails();
}
