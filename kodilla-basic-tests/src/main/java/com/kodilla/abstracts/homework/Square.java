package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return lenght * lenght;
    }

    @Override
    public double getPerimeter() {

        return 4 * lenght;
    }
}
