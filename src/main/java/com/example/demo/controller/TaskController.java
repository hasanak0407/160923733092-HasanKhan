package com.example.demo.controller;
import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping
    public String createTask(@RequestBody Task task) {
        taskService.createTask(task);
        return "New Task created successfully";
    }


    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id) {
        return taskService.getTask(id);
    }


    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }


    @PutMapping("/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody Task task) {
        taskService.updateTask(id, task);
        return "Existing Task updated successfully";
    }


    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted successfully";
    }
}