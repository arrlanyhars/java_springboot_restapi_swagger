package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.DriverStatus;
import com.sig.sig_sisi_rest_api.repository.DriverStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverStatusService {

    @Autowired
    private DriverStatusRepository driverStatusRepository;

    public List<DriverStatus> getAllDriverStatuses() {
        return driverStatusRepository.findAll();
    }

    public DriverStatus getDriverStatusById(int id) {
        return driverStatusRepository.findById(id).orElse(null);
    }

    public DriverStatus saveDriverStatus(DriverStatus driverStatus) {
        return driverStatusRepository.save(driverStatus);
    }

    public void deleteDriverStatus(int drs_id) {
        driverStatusRepository.deleteById(drs_id);
    }
}
