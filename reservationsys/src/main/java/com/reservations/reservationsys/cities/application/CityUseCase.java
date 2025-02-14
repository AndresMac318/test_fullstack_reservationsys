package com.reservations.reservationsys.cities.application;


import com.reservations.reservationsys.cities.domain.model.City;
import com.reservations.reservationsys.cities.domain.repository.CityRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityUseCase implements ICityUseCase {

    private final CityRepositoryPort cityRepositoryPort;

    public CityUseCase(CityRepositoryPort cityRepositoryPort) {
        this.cityRepositoryPort = cityRepositoryPort;
    }

    @Override
    public List<City> findAll() {
        return cityRepositoryPort.findAll();
    }


    // private final CityPersistenceOutputPort cityPersistenceOutputPort;

    /*
    @Override
    public City findByName(String name) {
        return cityPersistenceOutputPort.findByName(name)
                .orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public List<City> findAll() {
        return cityPersistenceOutputPort.findAll();
    }*/
}
