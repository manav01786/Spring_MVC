package com.manavit.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.manavit.entity.UserEntity;



public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	  UserEntity findByUEmailAndUPassword(String uEmail, String uPassword);
}
