package com.example.naulmont.patient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.naulmont.patient.PatientController.PATIENTS;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/" + PATIENTS)
public class PatientController {

    public static final String PATIENTS = "/patients";
    public static final String ALL = "/all";
    public static final String CREATE = "/create";
    public static final String DELETE = "/delete";

    private final PatientService patientService;

    @GetMapping(ALL)
    public ResponseEntity<List<Patient>> getAllPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    @PostMapping(CREATE)
    public void creatNewPatient(@RequestBody Patient patient) {
        patientService.createOrUpdateNewPatient(patient);
    }

    @DeleteMapping(DELETE)
    public void deletePatient(@RequestBody Patient patient) {
        patientService.deletePatient(patient);
    }

}
