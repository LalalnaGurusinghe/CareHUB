package com.example.patient_management.mapper;

import com.example.patient_management.dto.PatientRequestDTO;
import com.example.patient_management.dto.PatientResponseDTO;
import com.example.patient_management.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient){
       PatientResponseDTO dto = new PatientResponseDTO();
       dto.setId(patient.getId().toString());
       dto.setName(patient.getName());
       dto.setAddress(patient.getAddress());
       dto.setEmail(patient.getEmail());
       dto.setDateOfBirth(patient.getDateOfBirth().toString());
         return dto;

    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO){
        Patient patient = new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
        return patient;
    }
}
