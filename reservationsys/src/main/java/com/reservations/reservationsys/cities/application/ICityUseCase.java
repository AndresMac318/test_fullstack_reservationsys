package com.reservations.reservationsys.cities.application;

import com.reservations.reservationsys.cities.domain.model.City;

import java.util.List;

public interface ICityUseCase {
    List<City> findAll();
}
