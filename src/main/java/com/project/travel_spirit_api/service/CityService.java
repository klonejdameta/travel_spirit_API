package com.project.travel_spirit_api.service;

import com.project.travel_spirit_api.dto.CityDTO;
import com.project.travel_spirit_api.entity.City;
import com.project.travel_spirit_api.utils.ServiceResponse;

import java.util.List;

public interface CityService {
    List<CityDTO> getForSelect();

    ServiceResponse addCity(City city); //add eshte nje forme qe shton nje qytet dhe service response perdoret per validimin e fushave te formes ne back end

    List<City> getCities();
}
