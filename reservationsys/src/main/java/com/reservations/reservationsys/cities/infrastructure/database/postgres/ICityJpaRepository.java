package com.reservations.reservationsys.cities.infrastructure.database.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ICityJpaRepository extends JpaRepository<CityEntity, Long> {

    // usar optional codigo mas elegante y controlar cuando se dispara alguna excepcion
    List<CityEntity> findAll();
}
