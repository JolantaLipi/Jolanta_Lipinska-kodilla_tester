package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class PersonTest {

    @InjectMocks
    private Person person;

    @ParameterizedTest
    @MethodSource("provideBMIData")
    void shouldReturnCorrectBMICategory(double height, double weight, String expectedCategory) {
        person = new Person(height, weight);

        assertEquals(expectedCategory, person.getBMI());
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> provideBMIData() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(1.75, 50, "Underweight"),
                org.junit.jupiter.params.provider.Arguments.of(1.75, 70, "Normal (healthy weight)"),
                org.junit.jupiter.params.provider.Arguments.of(1.75, 85, "Overweight"),
                org.junit.jupiter.params.provider.Arguments.of(1.75, 100, "Obese Class I (Moderately obese)"),
                org.junit.jupiter.params.provider.Arguments.of(1.75, 120, "Obese Class II (Severely obese)")
        );
    }
}