package com.kodilla.collections.interfaces.homework;

public class Jeep implements Car {
    privte int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 11;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 11;

    }
}