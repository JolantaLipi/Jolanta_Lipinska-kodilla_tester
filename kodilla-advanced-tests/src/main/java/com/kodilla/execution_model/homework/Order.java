package com.kodilla.parametrized_tests.homework;

import java.time.LocalDate;

public class Order {

    private double value;  // Wartość zamówienia
    private LocalDate orderDate;  // Data zamówienia
    private String login;  // Login osoby dokonującej zamówienie

    // Konstruktor klasy Order
    public Order(double value, LocalDate orderDate, String login) {
        this.value = value;
        this.orderDate = orderDate;
        this.login = login;
    }

    // Gettery
    public double getValue() {
        return value;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getLogin() {
        return login;
    }

    // Metoda toString dla wygody
    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", orderDate=" + orderDate +
                ", login='" + login + '\'' +
                '}';
    }
}
