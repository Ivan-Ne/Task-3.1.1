package com.example.task311.Service;

import com.example.task311.Models.User;

import java.util.List;

public interface UserService {

    List<User> showAll();

    void save(User user);

    User show(int id);

    void update(int id, User updatedUser);

    void delete(int id);
}
