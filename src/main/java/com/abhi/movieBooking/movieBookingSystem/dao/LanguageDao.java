package com.abhi.movieBooking.movieBookingSystem.dao;

import java.util.Optional;

import com.abhi.movieBooking.movieBookingSystem.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LanguageDao extends JpaRepository<Language, Integer> {
    public Optional<Language> findByLanguageName(String languageName);
}