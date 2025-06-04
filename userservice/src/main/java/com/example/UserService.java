package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1L, "Alice"));
        users.add(new User(2L, "Bob"));
    }

    public Optional<User> getUserById(Long id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst();
    }
}
