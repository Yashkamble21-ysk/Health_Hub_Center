package com.hubhealth.health_hub_backend.mapper;

import com.hubhealth.health_hub_backend.dto.DoctorAndPatientDto;
import com.hubhealth.health_hub_backend.entity.DoctorAndPatient;

public class DoctorAndPatientMapper {

    public static DoctorAndPatientDto toDto(DoctorAndPatient doctorAndPatient) {
        return new DoctorAndPatientDto(
            doctorAndPatient.getId(),
            doctorAndPatient.getFullName(),
            doctorAndPatient.getEmail(),
            doctorAndPatient.getPhone(),
            doctorAndPatient.getAddress(),
            doctorAndPatient.getUsername(),
            doctorAndPatient.getPassword(),
            doctorAndPatient.getRole()
        );
    }

    public static DoctorAndPatient toEntity(DoctorAndPatientDto dto) {
        return new DoctorAndPatient(
            dto.getId(),
            dto.getFullName(),
            dto.getEmail(),
            dto.getPhone(),
            dto.getAddress(),
            dto.getUsername(),
            dto.getPassword(),
            dto.getRole()
        );
    }
}
