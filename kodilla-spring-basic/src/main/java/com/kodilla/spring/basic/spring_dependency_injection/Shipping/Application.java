package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        System.out.println(shippingCenter.sendPackage("Hill Street 11, New York", 18.2)); // Oczekiwany wynik: "Package delivered to: Hill Street 11, New York"
        System.out.println(shippingCenter.sendPackage("Hill Street 11, New York", 35.0)); // Oczekiwany wynik: "Package not delivered to: Hill Street 11, New York"
    }
}
