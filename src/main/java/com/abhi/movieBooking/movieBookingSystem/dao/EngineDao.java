package com.abhi.movieBooking.movieBookingSystem.dao;

import com.abhi.movieBooking.movieBookingSystem.entities.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineDao extends JpaRepository<Engine,Integer> {
}
