package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.DriverLeave;
import com.sig.sig_sisi_rest_api.repository.DriverLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverLeaveService {

    @Autowired
    private DriverLeaveRepository driverLeaveRepository;

    public List<DriverLeave> getAllDriverLeaves() {
        return driverLeaveRepository.findAll();
    }

    public DriverLeave getDriverLeaveById(int id) {
        return driverLeaveRepository.findById(id).orElse(null);
    }

    public DriverLeave saveDriverLeave(DriverLeave driverLeave) {
        return driverLeaveRepository.save(driverLeave);
    }

    public void deleteDriverLeave(int drl_id) {
        driverLeaveRepository.deleteById(drl_id);
    }
}
