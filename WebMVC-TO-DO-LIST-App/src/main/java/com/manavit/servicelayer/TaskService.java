package com.manavit.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manavit.entity.UserEntity;
import com.manavit.entity.UserTask;
import com.manavit.repository.TaskRepository;



@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void addTask(UserTask task) {
        taskRepository.save(task);
    }

    public List<UserTask> getTasksForUser(UserEntity user) {
        return taskRepository.findByUser(user);
    }
}

