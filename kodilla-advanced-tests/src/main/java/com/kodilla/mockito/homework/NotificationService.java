package com.kodilla.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationService {
    private Map<String, Set<Person>> locationSubscribers = new HashMap<>();

    public void subscribePersonToLocation(Person person, String location) {
        locationSubscribers.computeIfAbsent(location, k -> new HashSet<>()).add(person);
        person.subscribe(location);
    }

    public void unsubscribePersonFromLocation(Person person, String location) {
        Set<Person> subscribers = locationSubscribers.get(location);
        if (subscribers != null) {
            subscribers.remove(person);
        }
        person.unsubscribe(location);
    }

    public void unsubscribePersonFromAllLocations(Person person) {
        for (String location : person.getSubscriptions()) {
            unsubscribePersonFromLocation(person, location);
        }
        person.unsubscribeFromAll();
    }

    public void sendNotificationToAll(String message) {
        for (Set<Person> subscribers : locationSubscribers.values()) {
            for (Person person : subscribers) {
                System.out.println("Sending to " + person.getName() + ": " + message);
            }
        }
    }

    public void sendNotificationToLocation(String location, String message) {
        Set<Person> subscribers = locationSubscribers.get(location);
        if (subscribers != null) {
            for (Person person : subscribers) {
                System.out.println("Sending to " + person.getName() + " in " + location + ": " + message);
            }
        }
    }

    public void removeLocation(String location) {
        locationSubscribers.remove(location);
    }
}
