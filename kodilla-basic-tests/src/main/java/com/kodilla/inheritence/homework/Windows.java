package com.kodilla.inheritence.homework;

public class Windows extends OperatingSystem{
    public Windows(int year) {
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Operating system turned on.");
    }
    @Override
    public void turnOff() {
        System.out.println("Operating system turned off.");
    }
}


