package org.viper75.todosapiservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TaskDto {
    private String name;
    private Boolean important;
}
