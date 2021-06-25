package com.derek.projeto1.config;

import com.derek.projeto1.entity.User;
import com.derek.projeto1.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        
        User user = new User();
        
        user.setEmail("fulano@email.com");
        user.setName("Fulano");
        userRepository.save(user);
    }
    
}
