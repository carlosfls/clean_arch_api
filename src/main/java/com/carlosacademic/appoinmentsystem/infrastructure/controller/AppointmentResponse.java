package com.carlosacademic.appoinmentsystem.infrastructure.controller;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AppointmentResponse {

    private String appointmentId;

    private LocalDate appointmentDate;

    private String userEmail;
}
