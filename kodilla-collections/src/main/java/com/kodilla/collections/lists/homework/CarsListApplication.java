package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Bentley;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Opel());
        cars.add(new Opel());
        cars.add(new Bentley());
        cars.add(new Mustang());
        for (Car car : cars) {
            for (int n= 0; n < 3; n++) {
                car.increaseSpeed();
            }
            for (int n= 0; n < 2; n++) {
                car.decreaseSpeed();
            }

            CarUtils.describeCar(car);
        }
        cars.remove(1);
        cars.remove(new Mustang());

        System.out.println(cars.size());

    }
}
