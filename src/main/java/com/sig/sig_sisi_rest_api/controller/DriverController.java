package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.Driver;
import com.sig.sig_sisi_rest_api.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    @GetMapping("/{dr_id}")
    public Driver getDriverById(@PathVariable Long dr_id) {
        return driverService.getDriverById(dr_id);
    }

    @PostMapping
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.saveDriver(driver);
    }

    @PutMapping("/{dr_id}")
    public Driver updateDriver(@PathVariable Long dr_id, @RequestBody Driver driverDetails) {
        Driver driver = driverService.getDriverById(dr_id);
        if (driver != null) {
            driver.setDr_full_name(driverDetails.getDr_full_name());
            driver.setDr_status_id(driverDetails.getDr_status_id());
            driver.setDr_updated_at(driverDetails.getDr_updated_at());
            driver.setDr_updated_by(driverDetails.getDr_updated_by());
            return driverService.saveDriver(driver);
        }
        return null;
    }

    @DeleteMapping("/{dr_id}")
    public void deleteDriver(@PathVariable Long dr_id) {
        driverService.deleteDriver(dr_id);
    }
}
