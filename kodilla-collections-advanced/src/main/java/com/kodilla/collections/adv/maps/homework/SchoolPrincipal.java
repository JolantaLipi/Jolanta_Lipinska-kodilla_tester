package com.kodilla.collections.adv.maps.homework;

import java.util.Map;
import java.util.Objects;

public class SchoolPrincipal {
    private String name;

    public SchoolPrincipal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SchoolPrincipal that = (SchoolPrincipal) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
