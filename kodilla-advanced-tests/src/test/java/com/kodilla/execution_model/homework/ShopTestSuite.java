package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    private Shop shop;

    @BeforeEach
    void setUp() {
        shop = new com.kodilla.parametrized_tests.homework.Shop();

        shop.addOrder(new Order(100.50, LocalDate.of(2023, 5, 10), "user1"));
        shop.addOrder(new Order(200.75, LocalDate.of(2023, 6, 15), "user2"));
        shop.addOrder(new Order(50.25, LocalDate.of(2023, 7, 20), "user3"));
        shop.addOrder(new Order(150.00, LocalDate.of(2023, 5, 5), "user4"));
        shop.addOrder(new Order(80.00, LocalDate.of(2023, 8, 1), "user5"));
    }

    @AfterEach
    void tearDown() {
        shop = null;
    }

    @Test
    void testGetOrderCount() {
        assertEquals(5, shop.getOrderCount());
    }

    @Test
    void testGetTotalValue() {
        assertEquals(681.50, shop.getTotalValue(), 0.01);
    }

    @Test
    void testGetOrdersBetweenDates() {
        List<Order> ordersBetweenDates = shop.getOrdersBetweenDates(LocalDate.of(2023, 5, 1), LocalDate.of(2023, 6, 30));

        assertEquals(3, ordersBetweenDates.size());
    }

    @Test
    void testGetOrdersByValueRange() {
        List<Order> ordersByValueRange = shop.getOrdersByValueRange(50.00, 150.00);
        assertEquals(3, ordersByValueRange.size());
    }
}
