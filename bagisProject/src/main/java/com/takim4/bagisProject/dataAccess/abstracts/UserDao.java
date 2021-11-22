package com.takim4.bagisProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.takim4.bagisProject.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	User getByEmail(String email);
	
}