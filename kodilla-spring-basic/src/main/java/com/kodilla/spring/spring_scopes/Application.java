package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);

        System.out.println("Clock 1 time: " + clock1.getTime());
        System.out.println("Clock 2 time: " + clock2.getTime());

        if (clock1.getTime().equals(clock2.getTime())) {
            System.out.println("The times are the same.");
        } else {
            System.out.println("The times are different.");
        }
    }
}
