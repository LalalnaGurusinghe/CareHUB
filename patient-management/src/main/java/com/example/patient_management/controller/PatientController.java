package com.example.patient_management.controller;

import com.example.patient_management.dto.PatientRequestDTO;
import com.example.patient_management.dto.PatientResponseDTO;
import com.example.patient_management.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/patients")
public class PatientController {
    // Endpoints for patient management would go here
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PatientResponseDTO>> getAllPatients() {
        List<PatientResponseDTO> patients = patientService.getAllPatients();
        return ResponseEntity.ok(patients);
    }

    @PostMapping("/create")
    public ResponseEntity<PatientResponseDTO> createPatient(@Valid @RequestBody PatientRequestDTO patientRequestDTO) {
        PatientResponseDTO patientResponseDTO = patientService.createPatient(patientRequestDTO);
        return ResponseEntity.ok().body(patientResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PatientResponseDTO> updatePatientById(@Valid @PathVariable UUID id , @Valid @RequestBody PatientRequestDTO patientRequestDTO){
        return ResponseEntity.ok(patientService.updatePatient(id, patientRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PatientResponseDTO> deletePatientById(@Valid @PathVariable UUID id){
        return ResponseEntity.ok(patientService.deletePatientById(id));
    }
}
