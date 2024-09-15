package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.DeliveryOrder;
import com.sig.sig_sisi_rest_api.repository.DeliveryOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryOrderService {

    @Autowired
    private DeliveryOrderRepository deliveryOrderRepository;

    public List<DeliveryOrder> getAllDeliveryOrders() {
        return deliveryOrderRepository.findAll();
    }

    public DeliveryOrder getDeliveryOrderById(Long id) {
        return deliveryOrderRepository.findById(id).orElse(null);
    }

    public DeliveryOrder saveDeliveryOrder(DeliveryOrder deliveryOrder) {
        return deliveryOrderRepository.save(deliveryOrder);
    }

    public void deleteDeliveryOrder(Long do_id) {
        deliveryOrderRepository.deleteById(do_id);
    }
}
