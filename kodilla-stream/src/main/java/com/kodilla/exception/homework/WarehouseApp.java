package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("4"));

        try {
            Order foundOrder = warehouse.getOrder("1");
            System.out.println("Zamówienie o numerze " + foundOrder.getNumber() + " istnieje.");

            warehouse.getOrder("0");
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }
}