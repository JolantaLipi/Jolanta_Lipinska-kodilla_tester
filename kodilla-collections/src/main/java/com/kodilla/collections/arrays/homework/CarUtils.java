package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bentley;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Opel;

import static java.lang.System.out;

public class CarUtils {

    public static void describeCar(Car car) {
        if (car instanceof Opel) {
            System.out.println("Car details: OPEL, ");
        } else if (car instanceof Bentley) {
            System.out.println("Car details: BENTLEY, ");
        } else if (car instanceof Mustang) ;
        System.out.println("Car details: MUSTANG, ");
    }
        System.out.println("Speed: " + car.getSpeed());

    }
