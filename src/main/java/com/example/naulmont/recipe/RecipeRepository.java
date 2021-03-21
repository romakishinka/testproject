package com.example.naulmont.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    @Query(value = "select * from recipe where doctor_id = :doctor_id", nativeQuery = true)
    List<Recipe> getRecipesByDoctorId(@Param("doctor_id") int doctorId);



    @Query(value = "select * from recipe " +
            "where description = :description or priority = :priority or patient_id = :patientId", nativeQuery = true)
    List<Recipe> getFilteredRecipes(@Param("description") String description,
                                    @Param("priority") String priority,
                                    @Param("patientId") int patientId);
}
