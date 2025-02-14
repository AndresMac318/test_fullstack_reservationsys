package com.reservations.reservationsys.cities.infrastructure.database.rest;

import com.reservations.reservationsys.cities.domain.model.City;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityDtoMapper {

    public static CityResponseDto fromModelToDto(City city){
        return new CityResponseDto(
            city.getCityId(),
            city.getName()
        );
    }

    public static List<CityResponseDto> fromModelListToDtoList(List<City> citiesList){
        return citiesList.stream()
            .map(cityModel->fromModelToDto(cityModel))
            .toList();
    }
}
