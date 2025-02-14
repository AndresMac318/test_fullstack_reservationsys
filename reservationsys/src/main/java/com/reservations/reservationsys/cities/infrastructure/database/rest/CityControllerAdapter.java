package com.reservations.reservationsys.cities.infrastructure.database.rest;

import com.reservations.reservationsys.cities.application.ICityUseCase;
import com.reservations.reservationsys.cities.domain.model.City;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cities")
public class CityControllerAdapter {

    private final ICityUseCase iCityUseCase;

    @GetMapping
    public List<CityResponseDto> findAll(){
        List<City> cities = iCityUseCase.findAll();
        return CityDtoMapper.fromModelListToDtoList(cities);
    }
}
