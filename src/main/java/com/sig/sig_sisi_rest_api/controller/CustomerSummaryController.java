package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.CustomerSummary;
import com.sig.sig_sisi_rest_api.service.CustomerSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer_summaries")
public class CustomerSummaryController {

    @Autowired
    private CustomerSummaryService customerSummaryService;

    @GetMapping
    public List<CustomerSummary> getAllCustomerSummaries() {
        return customerSummaryService.getAllCustomerSummaries();
    }

    @GetMapping("/{csum_id}")
    public CustomerSummary getCustomerSummaryById(@PathVariable Long csum_id) {
        return customerSummaryService.getCustomerSummaryById(csum_id);
    }

    // @PostMapping
    // public CustomerSummary createCustomerSummary(@RequestBody CustomerSummary customerSummary) {
    //     return customerSummaryService.saveCustomerSummary(customerSummary);
    // }

    // @PutMapping("/{csum_id}")
    // public CustomerSummary updateCustomerSummary(@PathVariable Long csum_id, @RequestBody CustomerSummary customerSummaryDetails) {
    //     CustomerSummary customerSummary = customerSummaryService.getCustomerSummaryById(csum_id);
    //     if (customerSummary != null) {
    //         customerSummary.setCsum_total_purchase(customerSummaryDetails.getCsum_total_purchase());
    //         customerSummary.setCsum_total_trx(customerSummaryDetails.getCsum_total_trx());
    //         customerSummary.setCsum_updated_at(customerSummaryDetails.getCsum_updated_at());
    //         customerSummary.setCsum_updated_by(customerSummaryDetails.getCsum_updated_by());
    //         return customerSummaryService.saveCustomerSummary(customerSummary);
    //     }
    //     return null;
    // }

    @DeleteMapping("/{csum_id}")
    public void deleteCustomerSummary(@PathVariable Long csum_id) {
        customerSummaryService.deleteCustomerSummary(csum_id);
    }
}
