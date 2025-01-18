package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {

    private final String name;
    private final List<Integer> students;

    public School(String name, List<Integer> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getStudents() {
        return students;
    }
    public Integer getAllStudents() {
        int sum = 0;
        for (Integer number : students) {
            sum += number;
        }
        return sum;
    }
}
