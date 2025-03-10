package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime now = LocalTime.now();
        return now.isAfter(LocalTime.of(19, 59)) || now.isBefore(LocalTime.of(6, 0));
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
