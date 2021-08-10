package com.abhi.movieBooking.movieBookingSystem.Service;

import com.abhi.movieBooking.movieBookingSystem.Exceptions.CityDetailsNotFoundException;
import com.abhi.movieBooking.movieBookingSystem.entities.City;

import java.util.List;

public interface CityService {
    public City acceptCityDetails(City city);
    public List<City> acceptMultipleCityDetails(List<City> cities);
    public City updateCityDetails(int id, City city) throws CityDetailsNotFoundException;
    public City getCityDetails(int id) throws CityDetailsNotFoundException;
    public City getCityDetailsByCityName(String cityName) throws CityDetailsNotFoundException;
    public boolean deleteCity(int id) throws CityDetailsNotFoundException;
    public List<City> getAllCityDetails();
}
