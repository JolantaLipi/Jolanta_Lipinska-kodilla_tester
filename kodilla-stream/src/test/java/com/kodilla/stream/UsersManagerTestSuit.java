package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuit {

    @Test
    void testFilterChemistGroupUsernames() {
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();
        assertEquals(2, UsersRepository.size();
        assertTrue(UsersRepository.contains("Walter White"));
        assertTrue(UsersRepository.contains("Gale Boetticher"));
        assertFalse(UsersRepository.contains("Jessie Pinkman"));
    }
    @Test
    void testFilterUsersOlderThan() {
        List<User> olderThan30 = UsersRepository.filterUsersOlderThan(30, users);
        assertEquals(5, olderThan30.size();
        assertTrue(olderThan30.stream().allMatch(user -> user.getAge() > 30));
    }
    @Test
    void testFilterUsersWithMoreThanTenPosts() {
    List<User> usersWithMoreThanTenPosts = UsersRepository.filterUsersWithMoreThanTenPosts();
    assertEquals(2, usersWithMoreThanTenPosts.size();
    assertTrue(usersWithMoreThanTenPosts.stream().allMatch(user -> user.getPostCount() > 10));
}
}