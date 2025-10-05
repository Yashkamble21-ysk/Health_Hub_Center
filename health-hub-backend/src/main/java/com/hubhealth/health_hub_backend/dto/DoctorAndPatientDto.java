package com.hubhealth.health_hub_backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorAndPatientDto {

    private Long id;
    private String fullName;
    private String email;
    private String phone; // changed to String
    private String address;
    private String username;
    private String password;
    private String role;
}
