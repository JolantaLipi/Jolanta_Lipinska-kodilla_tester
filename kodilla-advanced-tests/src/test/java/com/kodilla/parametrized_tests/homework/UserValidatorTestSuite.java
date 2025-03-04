package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
public class UserValidatorTest {

    @InjectMocks
    private UserValidator userValidator;
    @ParameterizedTest
    @ValueSource(strings = {"user123", "user.name", "user-name", "user_123"})
    void shouldReturnTrueForValidUsernames(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"us", "user@name", "user#name", "123"})
    void shouldReturnFalseForInvalidUsernames(String username) {
        assertFalse(userValidator.validateUsername(username));
    }
    @InjectMocks
    private UserValidator userValidator;

    @ParameterizedTest
    @ValueSource(strings = {"user@example.com", "user.name@domain.co", "username@sub.domain.com"})
    void shouldReturnTrueForValidEmails(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user@com", "user@domain,com", "user@domain@com", "plainaddress", "user@domain"})
    void shouldReturnFalseForInvalidEmails(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}
