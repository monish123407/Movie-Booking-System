package com.abhi.movieBooking.movieBookingSystem.dao;

import com.abhi.movieBooking.movieBookingSystem.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao extends JpaRepository<Status, Integer> {
    public Status findByStatusName(String statusName);
}
