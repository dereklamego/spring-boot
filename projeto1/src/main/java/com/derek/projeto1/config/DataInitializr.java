package com.derek.projeto1.config;

import java.util.List;

import com.derek.projeto1.entity.User;
import com.derek.projeto1.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired   //para usar a instancia criada pelo Spring, em uma propriedade
    UserRepository userRepository; //nossa interface para fazer conexões com o banco

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) { //metodo chamado automaticamente ao compilarmos a aplicação 
        List<User> users = userRepository.findAll();

		if (users.isEmpty()) {

			createUser("derek", "derek@email.com");
			createUser("Fulano","fulano@email.com");
			createUser("Maria", "maria@email.com");
			
		}
		
		User user = userRepository.findByEmailQualquerCoisa("derek@email.com");

		System.out.println(user.getName());

	}
	
	
	public void createUser(String name, String email) {
		
		User user = new User(name, email);
		
		userRepository.save(user);
		
	}

}

