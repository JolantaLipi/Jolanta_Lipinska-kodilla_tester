package com.kodilla.parametrized_tests.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders;  // Kolekcja unikalnych zamówień

    // Konstruktor klasy Shop
    public Shop() {
        this.orders = new HashSet<>();
    }

    // Dodanie nowego zamówienia
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Zwrócenie listy zamówień w zakresie dwóch dat
    public List<Order> getOrdersBetweenDates(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
                .collect(Collectors.toList());
    }

    // Pobranie zamówień na podstawie zakresu wartości (najmniejsza i największa wartość)
    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= minValue && order.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    // Zwrócenie liczby zamówień
    public int getOrderCount() {
        return orders.size();
    }

    // Zsumowanie wartości wszystkich zamówień
    public double getTotalValue() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}
