package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculator = context.getBean(Calculator.class);

        // Testowanie metod kalkulatora
        calculator.add(5, 3);        // Expected: 8
        calculator.subtract(5, 3);   // Expected: 2
        calculator.multiply(5, 3);   // Expected: 15
        calculator.divide(5, 0);     // Expected: Error message
        calculator.divide(5, 2);     // Expected: 2.5
    }
}
