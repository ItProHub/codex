package com.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    public void testGetUserByIdFound() {
        UserService service = new UserService();
        Optional<User> user = service.getUserById(1L);
        assertTrue(user.isPresent());
        assertEquals("Alice", user.get().getName());
    }

    @Test
    public void testGetUserByIdNotFound() {
        UserService service = new UserService();
        Optional<User> user = service.getUserById(99L);
        assertFalse(user.isPresent());
    }
}
