package com.titouan.bankapp.infrastructure.persistence;

import com.titouan.bankapp.domain.model.User;
import com.titouan.bankapp.domain.repository.UserRepository;

import java.util.*;

public class InMemoryUserRepository implements UserRepository {

    private final Map<Long, User> users = new HashMap<>();

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public void save(User user) {
        users.put(user.getId(), user);
    }
}
