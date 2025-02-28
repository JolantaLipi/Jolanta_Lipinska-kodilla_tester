package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ForumStats {
    public static OptionalDouble averagePostsForUsersOver40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average();
    }
    public static OptionalDouble averagePostsForUsersUnder40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average();
    }
        OptionalDouble averageOver40 = averagePostsForUsersOver40(UsersRepository);
        averageOver40.ifPresent(avg -> System.out.println("Średnia liczba postów:" + avg));

        OptionalDouble averageUnder40 = averagePostsForUsersUnder40(UsersRepository);
        averageUnder40.ifPresent(avg -> System.out.println("Średnia liczba postów:" + avg));
    }
}