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

    @GetMapping("/{cu_id}")
    public Customer getCustomerById(@PathVariable Long cu_id) {
        return customerService.getCustomerById(cu_id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/{cu_id}")
    public Customer updateCustomer(@PathVariable Long cu_id, @RequestBody Customer customerDetails) {
        Customer customer = customerService.getCustomerById(cu_id);
        if (customer != null) {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            return customerService.saveCustomer(customer);
        }
        return null;
    }

    @DeleteMapping("/{cu_id}")
    public void deleteCustomer(@PathVariable Long cu_id) {
        customerService.deleteCustomer(cu_id);
    }
}
