package com.cl.usermanagement.service.Impl;

import com.cl.usermanagement.Entity.User;
import com.cl.usermanagement.repository.UserRepository;
import com.cl.usermanagement.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements userService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user=  userRepository.findById(id);
        return user.get();
    }
}
