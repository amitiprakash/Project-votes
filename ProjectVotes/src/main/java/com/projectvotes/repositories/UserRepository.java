package com.projectvotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectvotes.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
