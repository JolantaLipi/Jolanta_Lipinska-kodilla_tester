package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double base;
    private double hight;

    public Triangle(double base, double height) {
        this.base = base;
        this.hight = height;

    }
    @Override
    public double getArea() {
        return base * hight / 2;
    }

    @Override
    public double getPerimeter() {
        return base * 3;
    }
}
