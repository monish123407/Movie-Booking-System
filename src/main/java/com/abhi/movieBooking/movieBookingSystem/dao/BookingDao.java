package com.abhi.movieBooking.movieBookingSystem.dao;

import com.abhi.movieBooking.movieBookingSystem.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Integer> {
}
