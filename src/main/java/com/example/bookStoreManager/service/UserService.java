package com.example.bookStoreManager.service;


import com.example.bookStoreManager.model.User;
import com.example.bookStoreManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User authenticateUser(String email, String password) {
        // Logic to authenticate user
        return userRepository.findByEmail(email);
    }
}
