package com.reservations.reservationsys.cities.domain.repository;

import com.reservations.reservationsys.cities.domain.model.City;

import java.util.List;

public interface CityRepositoryPort {

    List<City> findAll();
}
