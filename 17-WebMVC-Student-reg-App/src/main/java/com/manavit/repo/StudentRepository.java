package com.manavit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manavit.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
