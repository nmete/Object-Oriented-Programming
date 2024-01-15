package com.cl.usermanagement.service;

import com.cl.usermanagement.Entity.User;
import org.springframework.stereotype.Service;

public interface userService {
    User createUser(User use);
    User getUserById(Long id);
}
