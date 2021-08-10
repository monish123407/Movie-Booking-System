package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.TheatreDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.Theatre;

import java.util.List;

public interface TheatreService {
    public Theatre acceptTheatreDetails(Theatre theatre);
    public Theatre getTheatreDetails(int id) throws TheatreDetailsNotFoundException;
    public Theatre updateTheatreDetails(int id, Theatre theatre) throws TheatreDetailsNotFoundException;
    public boolean deleteTheatre(int id) throws TheatreDetailsNotFoundException;
    public List<Theatre> getAllTheatreDetails();
}
