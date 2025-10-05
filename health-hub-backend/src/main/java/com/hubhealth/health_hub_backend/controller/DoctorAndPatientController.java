package com.hubhealth.health_hub_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hubhealth.health_hub_backend.dto.DoctorAndPatientDto;
import com.hubhealth.health_hub_backend.service.DoctorAndPatientService;
import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api") // REST standard with hyphen
public class DoctorAndPatientController {

    private final DoctorAndPatientService service;

     @PostMapping("/doctor_and_patients")
     public ResponseEntity<DoctorAndPatientDto> create(@RequestBody DoctorAndPatientDto dto) {
        return new ResponseEntity<>(service.createDoctorAndPatient(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DoctorAndPatientDto>> getAll() {
        return new ResponseEntity<>(service.getAllDoctorAndPatients(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoctorAndPatientDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getDoctorAndPatientById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoctorAndPatientDto> update(@PathVariable Long id, @RequestBody DoctorAndPatientDto dto) {
        return new ResponseEntity<>(service.updateDoctorAndPatient(id, dto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.deleteDoctorAndPatient(id);
        return new ResponseEntity<>("Doctor/Patient deleted successfully", HttpStatus.OK);
    }
}
