package com.hubhealth.health_hub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hubhealth.health_hub_backend.entity.DoctorAndPatient;

@Repository
public interface DoctorAndPatientRepository extends JpaRepository<DoctorAndPatient, Long> {
}
