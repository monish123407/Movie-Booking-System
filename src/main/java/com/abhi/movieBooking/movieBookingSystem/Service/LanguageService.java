package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.LanguageDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.Language;

import java.util.List;

public interface LanguageService {

    public Language acceptLanguageDetails(Language language);
    public Language getLanguageDetails(int id) throws LanguageDetailsNotFoundException;
    public Language getLanguageDetailsByLanguageName(String languageName) throws LanguageDetailsNotFoundException;
    public boolean deleteLanguage(int id) throws LanguageDetailsNotFoundException;
    public List<Language> getAllLanguageDetails();
}
