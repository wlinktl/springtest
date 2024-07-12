// src/test/java/com/example/demo/OrderServiceTest.java
package com.example.demo;

import com.example.demo.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testPlaceOrder() {
        String result = orderService.placeOrder();
        assertEquals("Order placed for Customer[name=John Doe, email=johndoe@example.com] with inventory Inventory[item=Widget, quantity=100]", result);
    }
}
