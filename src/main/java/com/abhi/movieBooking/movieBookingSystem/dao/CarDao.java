package com.abhi.movieBooking.movieBookingSystem.dao;

import com.abhi.movieBooking.movieBookingSystem.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<Car, Integer> {
}
