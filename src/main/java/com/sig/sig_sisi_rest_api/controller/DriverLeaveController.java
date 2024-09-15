package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.DriverLeave;
import com.sig.sig_sisi_rest_api.service.DriverLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/driver-leaves")
public class DriverLeaveController {

    @Autowired
    private DriverLeaveService driverLeaveService;

    @GetMapping
    public List<DriverLeave> getAllDriverLeaves() {
        return driverLeaveService.getAllDriverLeaves();
    }

    @GetMapping("/{drl_id}")
    public DriverLeave getDriverLeaveById(@PathVariable int drl_id) {
        return driverLeaveService.getDriverLeaveById(drl_id);
    }

    @PostMapping
    public DriverLeave createDriverLeave(@RequestBody DriverLeave driverLeave) {
        return driverLeaveService.saveDriverLeave(driverLeave);
    }

    // @PutMapping("/{drl_id}")
    // public DriverLeave updateDriverLeave(@PathVariable int drl_id, @RequestBody DriverLeave driverLeaveDetails) {
    //     DriverLeave driverLeave = driverLeaveService.getDriverLeaveById(drl_id);
    //     if (driverLeave != null) {
    //         driverLeave.setDrl_driver_id(driverLeaveDetails.getDrl_driver_id());
    //         driverLeave.setDrl_driver_status_id(driverLeaveDetails.getDrl_driver_status_id());
    //         driverLeave.setDrl_started_at(driverLeaveDetails.getDrl_started_at());
    //         driverLeave.setDrl_ended_at(driverLeaveDetails.getDrl_ended_at());
    //         driverLeave.setDrl_updated_at(driverLeaveDetails.getDrl_updated_at());
    //         driverLeave.setDrl_updated_by(driverLeaveDetails.getDrl_updated_by());
    //         return driverLeaveService.saveDriverLeave(driverLeave);
    //     }
    //     return null;
    // }

    @DeleteMapping("/{drl_id}")
    public void deleteDriverLeave(@PathVariable int drl_id) {
        driverLeaveService.deleteDriverLeave(drl_id);
    }
}
