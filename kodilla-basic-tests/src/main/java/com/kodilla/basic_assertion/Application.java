package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int subResult = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(-3, subResult);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
}       int powResult = calculator.power(a);
         correct = ResultChecker.assertEquals(25,   powerResult);
        if (correct) {
            System.out.println("Metoda power działa poprawnie dla liczb " + a ");
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczby " + a ");
}
}
}