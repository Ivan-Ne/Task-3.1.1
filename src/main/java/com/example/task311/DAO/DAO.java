package com.example.task311.DAO;

import com.example.task311.Models.User;

import java.util.List;

public interface DAO {

    List<User> showAll();

    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}

