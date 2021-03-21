package com.example.naulmont.patient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public void createOrUpdateNewPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }
}
