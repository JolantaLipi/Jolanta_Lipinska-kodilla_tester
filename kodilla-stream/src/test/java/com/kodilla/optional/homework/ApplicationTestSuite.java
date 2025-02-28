package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class ApplicationTest {

    @Test
    void testWithTeachers() {
        Teacher teacher1 = new Teacher("Tomasz Nowak");
        Teacher teacher2 = new Teacher("Anna Kowalska");

        List<Student> students = Arrays.asList(
                new Student("Jan Kowalski", teacher1),
                new Student("Anna Nowak", teacher2)
        );
        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }

        String expectedOutput = "Uczeń: Jan Kowalski, nauczyciel: Tomasz Nowak" +
                "Uczeń: Anna Nowak, nauczyciel: Anna Kowalska";
        assertEquals(expectedOutput, outputStream.toString());
    }
    @Test
    void testWithNoTeacher() {
        Teacher teacher1 = new Teacher("Tomasz Nowak");

        List<Student> students = Arrays.asList(
                new Student("Kamil Wiśnia", null),
                new Student("Marta Zamek", teacher1)
        );
        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }

        String expectedOutput = "Uczeń: Kamil Wiśniewski, nauczyciel: <undefined>" +
                "Uczeń: Marta Zamek, nauczyciel: Tomasz Nowak";
        assertEquals(expectedOutput, outputStream.toString());
    }
}