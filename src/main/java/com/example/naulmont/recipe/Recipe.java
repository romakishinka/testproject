package com.example.naulmont.recipe;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Entity
@Table(name = "recipe")
@Data
public class Recipe {

    @Id
    private Long id;

    @Column
    private String description;

    @Column
    private LocalDateTime date;

    @Column
    private int duration;

    @Column
    private String priority;

    @Column(name = "doctor_id")
    private int doctorId;

    @Column(name = "patient_id")
    private int patientId;
}
