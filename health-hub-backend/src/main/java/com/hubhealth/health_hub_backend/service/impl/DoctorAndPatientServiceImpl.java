package com.hubhealth.health_hub_backend.service.impl;

import org.springframework.stereotype.Service;
import com.hubhealth.health_hub_backend.dto.DoctorAndPatientDto;
import com.hubhealth.health_hub_backend.entity.DoctorAndPatient;
import com.hubhealth.health_hub_backend.mapper.DoctorAndPatientMapper;
import com.hubhealth.health_hub_backend.repository.DoctorAndPatientRepository;
import com.hubhealth.health_hub_backend.service.DoctorAndPatientService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DoctorAndPatientServiceImpl implements DoctorAndPatientService {

    private final DoctorAndPatientRepository repository;

    @Override
    public DoctorAndPatientDto createDoctorAndPatient(DoctorAndPatientDto dto) {
        DoctorAndPatient entity = DoctorAndPatientMapper.toEntity(dto);
        DoctorAndPatient saved = repository.save(entity);
        return DoctorAndPatientMapper.toDto(saved);
    }

    @Override
    public List<DoctorAndPatientDto> getAllDoctorAndPatients() {
        return repository.findAll()
                .stream()
                .map(DoctorAndPatientMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorAndPatientDto getDoctorAndPatientById(Long id) {
        DoctorAndPatient entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor/Patient not found with id " + id));
        return DoctorAndPatientMapper.toDto(entity);
    }

    @Override
    public DoctorAndPatientDto updateDoctorAndPatient(Long id, DoctorAndPatientDto dto) {
        DoctorAndPatient entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor/Patient not found with id " + id));

        entity.setFullName(dto.getFullName());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setAddress(dto.getAddress());
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setRole(dto.getRole());

        DoctorAndPatient updated = repository.save(entity);
        return DoctorAndPatientMapper.toDto(updated);
    }

    @Override
    public void deleteDoctorAndPatient(Long id) {
        repository.deleteById(id);
    }
}
