package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.BookingDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.Exceptions.MovieTheatreDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.Exceptions.UserDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.Booking;

import java.util.List;

public interface BookingService {

    public Booking acceptBookingDetails(Booking booking) throws MovieTheatreDetailsNotFoundException,
            UserDetailsNotFoundException;
    public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException;
    public boolean deleteBooking(int id) throws BookingDetailsNotFoundException;
    public List<Booking> getAllBookingDetails();
}
