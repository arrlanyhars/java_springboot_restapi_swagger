package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.CustomerSummary;
import com.sig.sig_sisi_rest_api.repository.CustomerSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerSummaryService {

    @Autowired
    private CustomerSummaryRepository customerSummaryRepository;

    public List<CustomerSummary> getAllCustomerSummaries() {
        return customerSummaryRepository.findAll();
    }

    public CustomerSummary getCustomerSummaryById(Long csum_id) {
        return customerSummaryRepository.findById(csum_id).orElse(null);
    }

    public CustomerSummary saveCustomerSummary(CustomerSummary customerSummary) {
        return customerSummaryRepository.save(customerSummary);
    }

    public void deleteCustomerSummary(Long csum_id) {
        customerSummaryRepository.deleteById(csum_id);
    }
}
