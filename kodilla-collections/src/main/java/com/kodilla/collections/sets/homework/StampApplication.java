package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        Stamp stamp1 = new Stamp("Poland 2023", 3.0, 2.5, true);
        Stamp stamp2 = new Stamp("Poland 2023", 3.0, 2.5, true);
        Stamp stamp3 = new Stamp("France 2022", 2.8, 2.2, false);
        Stamp stamp4 = new Stamp("Poland 2023", 3.0, 2.5, true);
        Stamp stamp5 = new Stamp("USA 2021", 4.0, 3.0, false);

        stamps.add(stamp1);
        stamps.add(stamp2);
        stamps.add(stamp3);
        stamps.add(stamp4);
        stamps.add(stamp5);

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

        System.out.println("Collection contains " + stamp1 + "? " + stamps.contains(stamp1));
    }
}

