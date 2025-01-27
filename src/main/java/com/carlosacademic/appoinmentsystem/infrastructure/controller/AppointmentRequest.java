package com.carlosacademic.appoinmentsystem.infrastructure.controller;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AppointmentRequest {

    private String userEmail;

    private LocalDate appointmentDate;
}
