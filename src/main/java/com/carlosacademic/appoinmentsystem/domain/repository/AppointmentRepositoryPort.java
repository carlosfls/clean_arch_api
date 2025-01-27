package com.carlosacademic.appoinmentsystem.domain.repository;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;

public interface AppointmentRepositoryPort {

    Appointment create(Appointment appointment);

    Appointment findByAppointmentId(String appointmentId);
}
