package com.kodilla.collections.interfaces.homework;

public class CarRace {

        public static void main(String[] args) {
            Car opel = new Opel();
            Car bentley = new Bentley();
            Car mustang = new Mustang();

            doRace(opel);
            doRace(bentley);
            doRace(mustang);
        }

        public static void doRace(Car car) {
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
            car.decreaseSpeed();
            car.decreaseSpeed();

            System.out.println("Final speed: " + car.getSpeed() + " km/h");
        }
    }
