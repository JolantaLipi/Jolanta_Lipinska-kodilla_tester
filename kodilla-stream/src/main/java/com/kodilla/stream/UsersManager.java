package com.kodilla.stream;


import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Nodes.collect;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }
    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static List<User> filterUsersOlderThan(int age, List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }
    public List<User> filterUsersWithMoreThanTenPosts() {
        return users.stream()
                .filter(user -> user.numberOfPost() > 10)
                .collect(Collectors.toList());
    }
}