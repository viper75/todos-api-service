package org.viper75.todosapiservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.viper75.todosapiservice.models.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
