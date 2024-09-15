package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.CustomerAddress;
import com.sig.sig_sisi_rest_api.service.CustomerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-addresses")
public class CustomerAddressController {

    @Autowired
    private CustomerAddressService customerAddressService;

    @GetMapping
    public List<CustomerAddress> getAllCustomerAddresses() {
        return customerAddressService.getAllCustomerAddresses();
    }

    @GetMapping("/{ca_id}")
    public CustomerAddress getCustomerAddressById(@PathVariable Long ca_id) {
        return customerAddressService.getCustomerAddressById(ca_id);
    }

    @PostMapping
    public CustomerAddress createCustomerAddress(@RequestBody CustomerAddress customerAddress) {
        return customerAddressService.saveCustomerAddress(customerAddress);
    }

    @PutMapping("/{ca_id}")
    public CustomerAddress updateCustomerAddress(@PathVariable Long ca_id, @RequestBody CustomerAddress customerAddressDetails) {
        CustomerAddress customerAddress = customerAddressService.getCustomerAddressById(ca_id);
        if (customerAddress != null) {
            customerAddress.setCa_jalan(customerAddressDetails.getCa_jalan());
            customerAddress.setCa_kelurahan(customerAddressDetails.getCa_kelurahan());
            customerAddress.setCa_kecamatan(customerAddressDetails.getCa_kecamatan());
            customerAddress.setCa_kab_kota_id(customerAddressDetails.getCa_kab_kota_id());
            customerAddress.setCa_postal_code(customerAddressDetails.getCa_postal_code());
            customerAddress.setCa_updated_at(customerAddressDetails.getCa_updated_at());
            customerAddress.setCa_updated_by(customerAddressDetails.getCa_updated_by());
            return customerAddressService.saveCustomerAddress(customerAddress);
        }
        return null;
    }

    @DeleteMapping("/{ca_id}")
    public void deleteCustomerAddress(@PathVariable Long ca_id) {
        customerAddressService.deleteCustomerAddress(ca_id);
    }
}
