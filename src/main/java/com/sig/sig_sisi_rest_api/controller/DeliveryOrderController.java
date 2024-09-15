package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.DeliveryOrder;
import com.sig.sig_sisi_rest_api.service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery_orders")
public class DeliveryOrderController {

    @Autowired
    private DeliveryOrderService deliveryOrderService;

    @GetMapping
    public List<DeliveryOrder> getAllDeliveryOrders() {
        return deliveryOrderService.getAllDeliveryOrders();
    }

    @GetMapping("/{do_id}")
    public DeliveryOrder getDeliveryOrderById(@PathVariable Long do_id) {
        return deliveryOrderService.getDeliveryOrderById(do_id);
    }

    @PostMapping
    public DeliveryOrder createDeliveryOrder(@RequestBody DeliveryOrder deliveryOrder) {
        return deliveryOrderService.saveDeliveryOrder(deliveryOrder);
    }

    // @PutMapping("/{do_id}")
    // public DeliveryOrder updateDeliveryOrder(@PathVariable Long do_id, @RequestBody DeliveryOrder deliveryOrderDetails) {
    //     DeliveryOrder deliveryOrder = deliveryOrderService.getDeliveryOrderById(do_id);
    //     if (deliveryOrder != null) {
    //         deliveryOrder.setDo_number(deliveryOrderDetails.getDo_number());
    //         deliveryOrder.setDo_destination_id(deliveryOrderDetails.getDo_destination_id());
    //         deliveryOrder.setDo_driver_id(deliveryOrderDetails.getDo_driver_id());
    //         deliveryOrder.setDo_updated_at(deliveryOrderDetails.getDo_updated_at());
    //         deliveryOrder.setDo_updated_by(deliveryOrderDetails.getDo_updated_by());
    //         return deliveryOrderService.saveDeliveryOrder(deliveryOrder);
    //     }
    //     return null;
    // }

    @DeleteMapping("/{do_id}")
    public void deleteDeliveryOrder(@PathVariable Long do_id) {
        deliveryOrderService.deleteDeliveryOrder(do_id);
    }
}
