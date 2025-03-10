package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        Car car = context.getBean(Car.class);

        System.out.println("Car type: " + car.getCarType());
        System.out.println("Are headlights on? " + (car.hasHeadlightsTurnedOn() ? "Yes" : "No"));
    }
}
