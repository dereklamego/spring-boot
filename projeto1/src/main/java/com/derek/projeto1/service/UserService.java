package com.derek.projeto1.service;

import java.util.List;

import com.derek.projeto1.entity.User;
import com.derek.projeto1.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
         
        return userRepository.findAll() ;
    }
}
