package com.derek.projeto1.repository;

import com.derek.projeto1.entity.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
        
public interface UserRepository extends MongoRepository<User, Long> {

	// @Query("select u from User u where u.name like %?1%")
	// User findByNameQualquerCoisa(String name);
	
	@Query("{'email' : ?0 }")
	User findByEmailQualquerCoisa(String email);
	
	User findByNameIgnoreCaseLike(String name);
	
	
}
