package com.kodilla.homework;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private Set<String> subscriptions = new HashSet<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<String> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(String location) {
        subscriptions.add(location);
    }

    public void unsubscribe(String location) {
        subscriptions.remove(location);
    }

    public void unsubscribeFromAll() {
        subscriptions.clear();
    }
}
