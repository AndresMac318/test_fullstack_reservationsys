package com.reservations.reservationsys.cities.infrastructure.database.rest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CityResponseDto {

    private Long cityId;
    private String name;

    public CityResponseDto(Long cityId, String name) {
        this.cityId = cityId;
        this.name = name;
    }
}
