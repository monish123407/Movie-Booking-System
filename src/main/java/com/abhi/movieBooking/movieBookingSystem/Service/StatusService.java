package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.StatusDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.Status;

import java.util.List;

public interface StatusService {
    public Status acceptStatusDetails(Status status);
    public Status getStatusDetails(int id) throws StatusDetailsNotFoundException;
    public Status getStatusDetailsByStatusName(String statusName) throws StatusDetailsNotFoundException;
    public boolean deleteStatus(int id) throws StatusDetailsNotFoundException;
    public List<Status> getAllStatusDetails();
}
