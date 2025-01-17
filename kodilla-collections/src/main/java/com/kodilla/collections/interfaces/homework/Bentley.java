package com.kodilla.collections.interfaces.homework;

public class Bentley implements Car {
    private int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 14;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 12;

    }
}
