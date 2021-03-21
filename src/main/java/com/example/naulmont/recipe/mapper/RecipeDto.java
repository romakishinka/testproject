package com.example.naulmont.recipe.mapper;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RecipeDto {

    private Long id;

    private String description;

    private LocalDateTime date;

    private int duration;

    private String priority;

    private int doctorId;

    private int patientId;


}


