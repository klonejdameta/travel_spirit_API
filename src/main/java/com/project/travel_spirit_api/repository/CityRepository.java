package com.project.travel_spirit_api.repository;

import com.project.travel_spirit_api.dto.CityDTO;
import com.project.travel_spirit_api.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    @Query("SELECT p FROM City p WHERE p.name = :name")
    List<City> getByName(String name);

    @Query("SELECT p.id as id, p.name as name FROM City p")
    List<CityDTO> getForSelect();

}

