package com.fabrizio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabrizio.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
