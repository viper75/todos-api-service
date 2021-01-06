package org.viper75.todosapiservice.service;

import org.springframework.http.ResponseEntity;
import org.viper75.todosapiservice.dto.TaskDto;
import org.viper75.todosapiservice.models.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    ResponseEntity<Task> insertTask(TaskDto taskDto);
    ResponseEntity<Task> updateTask(Task task);
    void deleteTask(Task task);
}
