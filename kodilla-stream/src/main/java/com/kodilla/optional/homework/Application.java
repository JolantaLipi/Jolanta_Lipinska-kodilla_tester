package com.kodilla.optional.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Tomasz Nowak");
        Teacher teacher2 = new Teacher("Anna Kowalska");

        List<Student> students = Arrays.asList(
                new Student("Jan Kowalski", teacher1),
                new Student("Anna Nowak", teacher2),
                new Student("Kamil Wiśnia", null),
                new Student("Marta Zamek", teacher1)
        );
        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
}