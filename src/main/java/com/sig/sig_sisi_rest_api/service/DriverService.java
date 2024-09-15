package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.Driver;
import com.sig.sig_sisi_rest_api.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public Driver getDriverById(Long id) {
        return driverRepository.findById(id).orElse(null);
    }

    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public void deleteDriver(Long dr_id) {
        driverRepository.deleteById(dr_id);
    }
}
