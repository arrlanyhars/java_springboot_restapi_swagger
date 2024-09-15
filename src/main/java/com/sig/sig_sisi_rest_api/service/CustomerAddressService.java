package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.CustomerAddress;
import com.sig.sig_sisi_rest_api.repository.CustomerAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerAddressService {

    @Autowired
    private CustomerAddressRepository customerAddressRepository;

    public List<CustomerAddress> getAllCustomerAddresses() {
        return customerAddressRepository.findAll();
    }

    public CustomerAddress getCustomerAddressById(Long ca_id) {
        return customerAddressRepository.findById(ca_id).orElse(null);
    }

    public CustomerAddress saveCustomerAddress(CustomerAddress customerAddress) {
        return customerAddressRepository.save(customerAddress);
    }

    public void deleteCustomerAddress(Long ca_id) {
        customerAddressRepository.deleteById(ca_id);
    }
}
