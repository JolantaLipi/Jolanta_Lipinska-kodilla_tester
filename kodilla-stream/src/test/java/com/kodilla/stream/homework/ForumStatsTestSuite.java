package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    void testAveragePostsForUsersOver40() {
        List<User> users = List.of(
                new User("Alek", 45, 15),
                new User("Bartek", 33, 30),
                new User("Czarek", 50, 8),
        );

        OptionalDouble averageOver40 = ForumStats.averagePostsForUsersOver40(users);
        assertTrue(averageOver40.isPresent(), "Średnia dla użytkowników >= 40 jest [rawdziwa.");
        assertEquals(13.67, averageOver40.getAsDouble(), 0.01, "Średnia liczba postów wynosi 13.67.");
    }

    @Test
    void testAveragePostsForUsersUnder40() {
        List<User> users = List.of(
                new User("Alek", 45, 15),
                new User("Bartek", 33, 30),
                new User("Czarek", 50, 8),
        );

        OptionalDouble averageUnder40 = ForumStats.averagePostsForUsersUnder40(users);

        assertTrue(averageUnder40.isPresent(), "Średnia dla użytkowników < 40 jest prawdziwa.");
        assertEquals(23.75, averageUnder40.getAsDouble(), 0.01, "Średnia liczba postów wynosi 23.75.");
    }

    @Test
    void testAveragePostsForUsersOver40NoUsers() {
        List<User> users = List.of();

        OptionalDouble averageOver40 = ForumStats.averagePostsForUsersOver40(users);
        assertFalse(averageOver40.isPresent(), "Średnia dla użytkowników >= 40 nie jest prawdziwa.");
    }

    @Test
    void testAveragePostsForUsersUnder40NoUsers() {
        List<User> users = List.of();

        OptionalDouble averageUnder40 = ForumStats.averagePostsForUsersUnder40(users);
        assertFalse(averageUnder40.isPresent(), "Średnia dla użytkowników < 40 nie prawdziwa.");
    }
}