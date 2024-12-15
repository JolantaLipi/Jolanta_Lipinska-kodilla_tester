package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(5, 5);
        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(triangle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(square.getPerimeter());
        System.out.println(triangle.getPerimeter());

    }
}
