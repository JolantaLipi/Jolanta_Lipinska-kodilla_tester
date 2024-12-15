package com.kodilla.inheritence.homework;

public class Appl {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem(1990);
        os.turnOn();
        os.turnOff();
        System.out.println("**********");
        Windows win = new Windows(1995);
        win.turnOn();
        win.turnOff();
    }

}