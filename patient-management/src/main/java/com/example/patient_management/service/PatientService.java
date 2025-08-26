package com.example.patient_management.service;

import com.example.patient_management.dto.PatientRequestDTO;
import com.example.patient_management.dto.PatientResponseDTO;
import com.example.patient_management.exception.EmailAlreadyExistsException;
import com.example.patient_management.mapper.PatientMapper;
import com.example.patient_management.model.Patient;
import com.example.patient_management.repo.PatientRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class PatientService {
    // Business logic for managing patients would go here

    private final PatientRepo patientRepo;

    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public List<PatientResponseDTO> getAllPatients() {
        List<Patient> patients = patientRepo.findAll();

        List<PatientResponseDTO> patientResponseDTOS = patients.stream()
                .map(PatientMapper::toDTO).toList();
        return patientResponseDTOS;
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
        if (patientRepo.existsByEmail(patientRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists: " + patientRequestDTO.getEmail());
        }


        Patient patient = patientRepo.save(PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDTO(patient);
    }

    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO) {
        Patient patient = patientRepo.findById(id).orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));

        if(patientRequestDTO.getName() != null){
            patient.setName(patientRequestDTO.getName());
        }
        if(patientRequestDTO.getEmail() != null){
            if (patientRepo.existsByEmail(patientRequestDTO.getEmail())) {
                throw new EmailAlreadyExistsException("Email already exists: " + patientRequestDTO.getEmail());
            }
            patient.setEmail(patientRequestDTO.getEmail());
        }
        if(patientRequestDTO.getAddress() != null){
            patient.setAddress(patientRequestDTO.getAddress());
        }
        if(patientRequestDTO.getDateOfBirth() != null){
            patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        }

        Patient updatedPatient = patientRepo.save(patient);
        return PatientMapper.toDTO(updatedPatient);
    }

    public PatientResponseDTO deletePatientById(UUID id){
        Patient patient = patientRepo.findById(id).orElseThrow(()->new RuntimeException("Patient not found with id: " + id));
        patientRepo.delete(patient);
        return PatientMapper.toDTO(patient);
    }
}
