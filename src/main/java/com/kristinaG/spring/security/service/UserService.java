package com.kristinaG.spring.security.service;

import com.kristinaG.spring.security.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void updateUser(User user);

    public User getUserById(long id);

    public void deleteUser(long id);

    User findUserByName(String username);
}
