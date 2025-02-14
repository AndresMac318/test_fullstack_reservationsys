package com.reservations.reservationsys.cities.infrastructure.database.postgres;

import com.reservations.reservationsys.cities.domain.model.City;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityEntityMapper {

    public static City fromEntityToModel(CityEntity cityEntity){
        return new City(
            cityEntity.getCityId(),
            cityEntity.getName()
        );
    }

    public static List<City> fromEntityListToModelList(List<CityEntity> citiesEntities){
        return citiesEntities.stream()
            .map(entity->fromEntityToModel(entity))
            .toList();
    }
}
