package com.sjsu.CrazyConvo.Service;

import com.sjsu.CrazyConvo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();
}
