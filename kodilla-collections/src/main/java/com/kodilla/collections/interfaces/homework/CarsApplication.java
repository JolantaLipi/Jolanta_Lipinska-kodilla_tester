package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

            Random random = new Random();
            int arraySize = random.nextInt(15) + 1;
            Car[] cars = new Car[arraySize];

            for (int n = 0; n < cars.length; n++) {
                cars[n] = drawCar();
            }


            for (Car car : cars) {
                CarUtils.describeCar(car);
            }
        }

        public static Car drawCar() {
            Random random = new Random();
            int carType = random.nextInt(3);


            int increaseTime = random.nextInt(5) + 1;
            for (int n = 0; n < increaseTime; n++) {
                car.increaseSpeed();
            }

            return car;
        }


    }