package com.reservations.reservationsys.cities.infrastructure.database.postgres;

import com.reservations.reservationsys.cities.domain.model.City;
import com.reservations.reservationsys.cities.domain.repository.CityRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class CityRepositoryAdapter implements CityRepositoryPort {

    private final ICityJpaRepository iCityJpaRepository;

    @Override
    public List<City> findAll() {
        List<CityEntity> citiesEntities = iCityJpaRepository.findAll();
        // usar mapper de entity a domain (aisla la application de dtos/entities)
        return CityEntityMapper.fromEntityListToModelList(citiesEntities);
    }

}
