package org.viper75.todosapiservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.viper75.todosapiservice.dto.TaskDto;
import org.viper75.todosapiservice.models.Task;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    @Mapping(target = "important", defaultValue = "false")
    @Mapping(target = "completed", constant = "false")
    @Mapping(target = "created", expression = "java(System.currentTimeMillis())")
    Task map(TaskDto taskDto);
}
