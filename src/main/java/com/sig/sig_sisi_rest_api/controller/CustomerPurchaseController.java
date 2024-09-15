package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.CustomerPurchase;
import com.sig.sig_sisi_rest_api.service.CustomerPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer_purchases")
public class CustomerPurchaseController {

    @Autowired
    private CustomerPurchaseService customerPurchaseService;

    @GetMapping
    public List<CustomerPurchase> getAllCustomerPurchases() {
        return customerPurchaseService.getAllCustomerPurchases();
    }

    @GetMapping("/{cpur_id}")
    public CustomerPurchase getCustomerPurchaseById(@PathVariable Long cpur_id) {
        return customerPurchaseService.getCustomerPurchaseById(cpur_id);
    }

    // @PostMapping
    // public CustomerPurchase createCustomerPurchase(@RequestBody CustomerPurchase customerPurchase) {
    //     return customerPurchaseService.saveCustomerPurchase(customerPurchase);
    // }

    // @PutMapping("/{cpur_id}")
    // public CustomerPurchase updateCustomerPurchase(@PathVariable Long cpur_id, @RequestBody CustomerPurchase customerPurchaseDetails) {
    //     CustomerPurchase customerPurchase = customerPurchaseService.getCustomerPurchaseById(cpur_id);
    //     if (customerPurchase != null) {
    //         customerPurchase.setCpur_total_purchase(customerPurchaseDetails.getCpur_total_purchase());
    //         customerPurchase.setCpur_date(customerPurchaseDetails.getCpur_date());
    //         customerPurchase.setCpur_updated_at(customerPurchaseDetails.getCpur_updated_at());
    //         customerPurchase.setCpur_updated_by(customerPurchaseDetails.getCpur_updated_by());
    //         return customerPurchaseService.saveCustomerPurchase(customerPurchase);
    //     }
    //     return null;
    // }

    @DeleteMapping("/{cpur_id}")
    public void deleteCustomerPurchase(@PathVariable Long cpur_id) {
        customerPurchaseService.deleteCustomerPurchase(cpur_id);
    }
}
