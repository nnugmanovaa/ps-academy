package com.example.pmcourse.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskCreateDto {
    @NotBlank
    @NotNull
    private LocalDate date;

    @NotBlank
    @NotNull
    private String description;
}
