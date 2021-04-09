package com.kristinaG.spring.security.dao;

import com.kristinaG.spring.security.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void updateUser(User user);

    public User getUserById(long id);

    public void deleteUser(long id);

    User findUserByName(String username);

}
