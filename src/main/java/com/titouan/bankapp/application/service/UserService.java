package com.titouan.bankapp.application.service;

import com.titouan.bankapp.domain.model.User;
import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    void createUser(User user);
}
