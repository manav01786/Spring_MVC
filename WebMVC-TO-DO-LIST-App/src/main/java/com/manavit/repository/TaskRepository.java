package com.manavit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manavit.entity.UserEntity;
import com.manavit.entity.UserTask;



public interface TaskRepository extends JpaRepository<UserTask,Integer> {
	  List<UserTask> findByUser(UserEntity user);
}
