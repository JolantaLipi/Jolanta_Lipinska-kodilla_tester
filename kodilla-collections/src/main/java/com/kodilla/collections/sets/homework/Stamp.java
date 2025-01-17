package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double height;
    private boolean isPostmarked;

    public Stamp(String name, double width, double height, boolean isPostmarked) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.isPostmarked = isPostmarked;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isPostmarked() {
        return isPostmarked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.height, height) == 0 &&
                isPostmarked == stamp.isPostmarked &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, isPostmarked);
    }
}
