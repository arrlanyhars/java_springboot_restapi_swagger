package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.Customer;
import com.sig.sig_sisi_rest_api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{c_id}")
    public Customer getCustomerById(@PathVariable Long c_id) {
        return customerService.getCustomerById(c_id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/{c_id}")
    public Customer updateCustomer(@PathVariable Long c_id, @RequestBody Customer customerDetails) {
        Customer customer = customerService.getCustomerById(c_id);
        if (customer != null) {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            customer.setStatus(customerDetails.getStatus());
            customer.setAcceptedById(customerDetails.getAcceptedById());
            customer.setUpdatedAt(customerDetails.getUpdatedAt());
            customer.setUpdatedBy(customerDetails.getUpdatedBy());
            return customerService.saveCustomer(customer);
        }
        return null;
    }

    @DeleteMapping("/{c_id}")
    public void deleteCustomer(@PathVariable Long c_id) {
        customerService.deleteCustomer(c_id);
    }
}
