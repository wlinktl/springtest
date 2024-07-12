// src/main/java/com/example/demo/service/OrderService.java
package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final CustomerService customerService;
    private final InventoryService inventoryService;

    public OrderService(CustomerService customerService, InventoryService inventoryService) {
        this.customerService = customerService;
        this.inventoryService = inventoryService;
    }

    public String placeOrder() {
        String customerInfo = customerService.getCustomerInfo();
        String inventoryInfo = inventoryService.getInventoryInfo();
        return "Order placed for " + customerInfo + " with inventory " + inventoryInfo;
    }
}
