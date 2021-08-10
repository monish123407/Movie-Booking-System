package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.UserDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.Exceptions.UserNameAlreadyExistsException;
import com.abhi.movieBooking.movieBookingSystem.Exceptions.UserTypeDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.User;

public interface UserService {
    public User acceptUserDetails(User user)
            throws UserNameAlreadyExistsException, UserTypeDetailsNotFoundException;

    public User getUserDetails(int id) throws UserDetailsNotFoundException;

    public User getUserDetailsByUsername(String username) throws UserDetailsNotFoundException;

    public User updateUserDetails(int id, User user)
            throws UserNameAlreadyExistsException, UserDetailsNotFoundException, UserTypeDetailsNotFoundException;

}
