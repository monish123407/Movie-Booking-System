package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.*;

public interface InitService {
    public void init() throws UserNameAlreadyExistsException, UserTypeDetailsNotFoundException,
            TheatreDetailsNotFoundException, MovieDetailsNotFoundException,
            MovieTheatreDetailsNotFoundException, UserDetailsNotFoundException;
}
