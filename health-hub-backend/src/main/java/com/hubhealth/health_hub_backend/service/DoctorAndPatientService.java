package com.hubhealth.health_hub_backend.service;

import com.hubhealth.health_hub_backend.dto.DoctorAndPatientDto;
import java.util.List;

public interface DoctorAndPatientService {

    DoctorAndPatientDto createDoctorAndPatient(DoctorAndPatientDto dto);

    List<DoctorAndPatientDto> getAllDoctorAndPatients();

    DoctorAndPatientDto getDoctorAndPatientById(Long id);

    DoctorAndPatientDto updateDoctorAndPatient(Long id, DoctorAndPatientDto dto);

    void deleteDoctorAndPatient(Long id);
}
