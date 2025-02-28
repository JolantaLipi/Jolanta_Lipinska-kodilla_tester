package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    void testGetOrderThrowsExceptionWhenOrderDoesNotExist() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("4"));

        Exception exception = assertThrows(OrderDoesntExistException.class, () -> {
            warehouse.getOrder("9");
        });
        assertEquals("Zamówienie o numerze 9 nie istnieje.", exception.getMessage());
    }
}