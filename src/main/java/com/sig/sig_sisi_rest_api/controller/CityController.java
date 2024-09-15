package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.City;
import com.sig.sig_sisi_rest_api.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{ci_id}")
    public City getCityById(@PathVariable Long ci_id) {
        return cityService.getCityById(ci_id);
    }

    @PostMapping
    public City createCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @PutMapping("/{ci_id}")
    public City updateCity(@PathVariable Long ci_id, @RequestBody City cityDetails) {
        City city = cityService.getCityById(ci_id);
        if (city != null) {
            city.setCi_description(cityDetails.getCi_description());
            city.setCi_updated_at(cityDetails.getCi_updated_at());
            city.setCi_updated_by(cityDetails.getCi_updated_by());
            return cityService.saveCity(city);
        }
        return null;
    }

    @DeleteMapping("/{ci_id}")
    public void deleteCity(@PathVariable Long ci_id) {
        cityService.deleteCity(ci_id);
    }
}
