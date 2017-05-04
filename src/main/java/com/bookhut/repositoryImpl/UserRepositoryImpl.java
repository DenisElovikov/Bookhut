package com.bookhut.repositoryImpl;

import com.bookhut.entities.User;
import com.bookhut.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private static UserRepository userRepository;

    private List<User> users;

    public UserRepositoryImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public User findByUsernameAndPassword(final String username, final String password) {
        User user = users
                .stream()
                .filter(u -> u.getUsername().equals(username)
                        && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
        return user;
    }
}
