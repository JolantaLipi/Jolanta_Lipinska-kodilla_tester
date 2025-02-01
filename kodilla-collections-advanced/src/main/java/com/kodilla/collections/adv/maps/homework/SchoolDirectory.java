package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        SchoolPrincipal p1 = new SchoolPrincipal("Jan Nowak");
        SchoolPrincipal p2 = new SchoolPrincipal("Janusz Nowak");
        SchoolPrincipal p3 = new SchoolPrincipal("Jaromir Nowak");

        List<Integer> students1 = List.of(20, 25, 19, 22);
        List<Integer> students2 = List.of(21, 24, 18, 27);
        List<Integer> students3 = List.of(22, 21, 19, 28);

        School s1 = new School("SP1", students1);
        School s2 = new School("SP2", students2);
        School s3 = new School("SP3", students3);

        Map<SchoolPrincipal, School> educationSystem = new HashMap<>();
        educationSystem.put(p1, s1);
        educationSystem.put(p2, s2);
        educationSystem.put(p3, s3);

        for (Map.Entry<SchoolPrincipal, School> entry : educationSystem.entrySet()) {
            System.out.println(entry.getKey().getName() + ", " + entry.getKey().getName() + " (" + entry.getValue().getStudents() + ")");
        }


    }
}
