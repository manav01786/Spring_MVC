package com.manavit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.manavit.entity.UserEntity;
import com.manavit.entity.UserTask;
import com.manavit.servicelayer.TaskService;

import jakarta.servlet.http.HttpSession;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public String viewTasks(HttpSession session, Model model) {
        UserEntity loggedInUser = (UserEntity) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            model.addAttribute("tasks", taskService.getTasksForUser(loggedInUser));
            return "taskList";
        }
        return "login";
    }

    @GetMapping("/tasks/add")
    public String showTaskForm() {
        return "addTask";
    }

    @PostMapping("/tasks/addtask")
    public String addTask(@ModelAttribute UserTask task, HttpSession session) {
        UserEntity loggedInUser = (UserEntity) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            task.setUser(loggedInUser);
            taskService.addTask(task);
            return "welcome";
        }
        return "login";
    }
}
