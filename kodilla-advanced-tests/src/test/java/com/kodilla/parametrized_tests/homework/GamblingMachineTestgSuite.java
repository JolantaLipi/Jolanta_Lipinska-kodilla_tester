package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTest {

    @InjectMocks
    private GamblingMachine gamblingMachine;

    @ParameterizedTest
    @CsvFileSource(resources = "/InvalidNumbers.csv", numLinesToSkip = 1)
    })
    void shouldReturnValidResultsForValidUserNumbers(String userNumbers) throws InvalidNumbersException {
        Set<Integer> userSet = convertStringToSet(userNumbers);
        int wins = gamblingMachine.howManyWins(userSet);
        assertEquals(0, wins);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/InvalidNumbers.csv", numLinesToSkip = 1)
            })
    void shouldThrowInvalidNumbersExceptionForInvalidUserNumbers(String userNumbers) {
        Set<Integer> userSet = convertStringToSet(userNumbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userSet));
    }

    private Set<Integer> convertStringToSet(String userNumbers) {
        String[] numbers = userNumbers.split(",");
        Set<Integer> numberSet = new HashSet<>();
        for (String number : numbers) {
            numberSet.add(Integer.parseInt(number.trim()));
        }
        return numberSet;
    }
}
