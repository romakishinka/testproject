package com.example.naulmont.doctor;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
@AllArgsConstructor
public class DoctorController {
    public static final String All = "/all";
    public static final String CREATE = "/create";
    public static final String DELETE = "/delete";
    public static final String DOCTOR_ID = "/{doctorId:\\w+}";
    public static final String NUMBER_OF_RECIPE = "/recipe";

    private final DoctorService doctorService;

    @GetMapping(All)
    public ResponseEntity<List<Doctor>> getDoctors() {
        return ResponseEntity.ok(doctorService.getDoctors());
    }

    @PostMapping(CREATE)
    public void createDoctor(@RequestBody Doctor doctor) {
        doctorService.createDoctor(doctor);
    }

    @DeleteMapping(DELETE + DOCTOR_ID)
    public void deleteDoctorById(@PathVariable long doctorId) {
        doctorService.deleteDoctor(doctorId);
    }

    @GetMapping(NUMBER_OF_RECIPE + DOCTOR_ID)
    public ResponseEntity<Integer> getNumberOfRecipeById(@PathVariable int doctorId) {
        return ResponseEntity.ok(doctorService.getNumberOfRecipeById(doctorId));
    }
}
