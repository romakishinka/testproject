package com.example.naulmont.doctor;

import com.example.naulmont.recipe.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;
    private final RecipeRepository recipeRepository;

    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }

    public void createDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void deleteDoctor(long doctorId) {
        doctorRepository.deleteById(doctorId);
    }

    public Integer getNumberOfRecipeById(int doctorId) {
        return recipeRepository.getRecipesByDoctorId(doctorId).size();
    }
}
