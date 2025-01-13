package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    privte int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 9;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;

    }
}
