package com.carlosacademic.appoinmentsystem.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Appointment {

    private String appointmentId;

    private LocalDate appointmentDate;

    private String userEmail;
}
