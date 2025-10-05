package com.hubhealth.health_hub_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthHubBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthHubBackendApplication.class, args);
        System.out.println("Health Hub Backend is running...");
    }
}