// src/main/java/com/example/demo/service/CustomerService.java
package com.example.demo.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "customer")
public class CustomerService {

    private String name;
    private String email;

    public String getCustomerInfo() {
        return "Customer[name=" + name + ", email=" + email + "]";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
