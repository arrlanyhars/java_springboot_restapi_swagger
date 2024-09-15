package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.City;
import com.sig.sig_sisi_rest_api.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public City getCityById(Long ci_id) {
        return cityRepository.findById(ci_id).orElse(null);
    }

    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    public void deleteCity(Long ci_id) {
        cityRepository.deleteById(ci_id);
    }
}
