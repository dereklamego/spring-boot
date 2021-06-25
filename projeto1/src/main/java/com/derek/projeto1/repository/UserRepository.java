package com.derek.projeto1.repository;

import com.derek.projeto1.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends  JpaRepository<User,Long>{
    
}
