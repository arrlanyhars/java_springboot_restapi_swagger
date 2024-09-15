package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.CustomerPurchase;
import com.sig.sig_sisi_rest_api.repository.CustomerPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerPurchaseService {

    @Autowired
    private CustomerPurchaseRepository customerPurchaseRepository;

    public List<CustomerPurchase> getAllCustomerPurchases() {
        return customerPurchaseRepository.findAll();
    }

    public CustomerPurchase getCustomerPurchaseById(Long cpur_id) {
        return customerPurchaseRepository.findById(cpur_id).orElse(null);
    }

    public CustomerPurchase saveCustomerPurchase(CustomerPurchase customerPurchase) {
        return customerPurchaseRepository.save(customerPurchase);
    }

    public void deleteCustomerPurchase(Long cpur_id) {
        customerPurchaseRepository.deleteById(cpur_id);
    }
}
