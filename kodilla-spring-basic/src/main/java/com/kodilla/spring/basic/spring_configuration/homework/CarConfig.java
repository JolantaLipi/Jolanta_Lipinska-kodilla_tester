package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;

@Configuration
public class CarConfig {

    @Bean
    public Car car() {
        int month = LocalDate.now().getMonthValue();
        int hour = LocalDate.now().getHour();

        if (month >= 6 && month <= 8) {
            return new Cabrio();
        } else if (month == 12 || month <= 2) {
            return new SUV();
        } else {
            return new Sedan();
        }
    }
}
