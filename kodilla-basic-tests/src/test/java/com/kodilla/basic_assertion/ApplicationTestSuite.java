package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult)
}
@Test
public void testSub() {
    Calculator calculator = new Calculator();
    int a = 5;
    int b = 8;
    int subResult = calculator.sum(a, b);
    assertEquals(-3, subResult)

}
@Test
public void testPow() {
    Calculator calculator = new Calculator();
    int a = -1;
    int b = 0;
    int c = 1;
    int powResult = calculator.power(a, b, c)
    assertEquals(double expected, double actual, double delta)

}
