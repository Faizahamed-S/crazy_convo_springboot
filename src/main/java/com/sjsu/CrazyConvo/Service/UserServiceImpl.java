package com.sjsu.CrazyConvo.Service;

import com.sjsu.CrazyConvo.Repository.UserRepository;
import com.sjsu.CrazyConvo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository repo;
    @Override
    public List<User> getAllUsers() {

        return repo.findAll();
    }
}
