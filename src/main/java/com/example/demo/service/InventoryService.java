// src/main/java/com/example/demo/service/InventoryService.java
package com.example.demo.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "inventory")
public class InventoryService {

    private String item;
    private int quantity;

    public String getInventoryInfo() {
        return "Inventory[item=" + item + ", quantity=" + quantity + "]";
    }

    // Getters and Setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
