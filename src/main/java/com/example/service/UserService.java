package com.example.service;

/**
 * Created by Kaiser Ahmed on 3/8/2017.
 */
import com.example.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
    public void updateToPaidUser(User user);
}
