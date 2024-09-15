package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.DriverStatus;
import com.sig.sig_sisi_rest_api.service.DriverStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/driver-statuses")
public class DriverStatusController {

    @Autowired
    private DriverStatusService driverStatusService;

    @GetMapping
    public List<DriverStatus> getAllDriverStatuses() {
        return driverStatusService.getAllDriverStatuses();
    }

    @GetMapping("/{drs_id}")
    public DriverStatus getDriverStatusById(@PathVariable int drs_id) {
        return driverStatusService.getDriverStatusById(drs_id);
    }

    @PostMapping
    public DriverStatus createDriverStatus(@RequestBody DriverStatus driverStatus) {
        return driverStatusService.saveDriverStatus(driverStatus);
    }

    @PutMapping("/{drs_id}")
    public DriverStatus updateDriverStatus(@PathVariable int drs_id, @RequestBody DriverStatus driverStatusDetails) {
        DriverStatus driverStatus = driverStatusService.getDriverStatusById(drs_id);
        if (driverStatus != null) {
            driverStatus.setDrs_description(driverStatusDetails.getDrs_description());
            driverStatus.setDrs_updated_at(driverStatusDetails.getDrs_updated_at());
            driverStatus.setDrs_updated_by(driverStatusDetails.getDrs_updated_by());
            return driverStatusService.saveDriverStatus(driverStatus);
        }
        return null;
    }

    @DeleteMapping("/{drs_id}")
    public void deleteDriverStatus(@PathVariable int drs_id) {
        driverStatusService.deleteDriverStatus(drs_id);
    }
}
