package org.viper75.todosapiservice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.viper75.todosapiservice.dto.TaskDto;
import org.viper75.todosapiservice.exceptions.InvalidArgumentsException;
import org.viper75.todosapiservice.mapper.TaskMapper;
import org.viper75.todosapiservice.models.Task;
import org.viper75.todosapiservice.repository.TaskRepository;
import org.viper75.todosapiservice.service.TaskService;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Override
    public List<Task> getAllTasks() {
        return (List<Task>) taskRepository.findAll();
    }

    @Override
    public ResponseEntity<Task> insertTask(TaskDto taskDto) {
        if (!StringUtils.hasText(taskDto.getName())) {
            throw new InvalidArgumentsException("Name is required.");
        }

        Task task = taskMapper.map(taskDto);
        return ResponseEntity.ok(taskRepository.save(task));
    }

    @Override
    public ResponseEntity<Task> updateTask(Task task) {
        return ResponseEntity.ok(taskRepository.save(task));
    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }
}
