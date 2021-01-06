package org.viper75.todosapiservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viper75.todosapiservice.dto.TaskDto;
import org.viper75.todosapiservice.models.Task;
import org.viper75.todosapiservice.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public ResponseEntity<Task> insertTask(@RequestBody TaskDto taskDto) {
        return taskService.insertTask(taskDto);
    }

    @PatchMapping
    public ResponseEntity<Task> updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping
    public void deleteTask(@RequestBody Task task) {
        taskService.deleteTask(task);
    }
}
