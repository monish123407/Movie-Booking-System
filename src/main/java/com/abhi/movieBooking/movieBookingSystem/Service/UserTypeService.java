package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.UserTypeDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.UserType;

import java.util.List;

public interface UserTypeService {
    public UserType acceptUserTypeDetails(UserType userType);
    public UserType getUserTypeDetails(int id) throws UserTypeDetailsNotFoundException;
    public UserType getUserTypeDetailsFromUserTypeName(String userType) throws UserTypeDetailsNotFoundException;
    public boolean deleteUserType(int id) throws UserTypeDetailsNotFoundException;
    public List<UserType> getAllUserTypeDetails();
}
