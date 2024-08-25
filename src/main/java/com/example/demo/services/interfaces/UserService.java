package com.example.demo.services.interfaces;


import com.example.demo.model.User;

public interface UserService {
    
    public void saveUser(User user);
    public User findByUsername(String username);
    public User authenticateUser(String username, String password);
}
