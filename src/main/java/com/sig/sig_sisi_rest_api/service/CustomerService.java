package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.Customer;
import com.sig.sig_sisi_rest_api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long c_id) {
        return customerRepository.findById(c_id).orElse(null);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long c_id) {
        customerRepository.deleteById(c_id);
    }
}
