package com.carlosacademic.appoinmentsystem.usecase;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;

public interface FindAppointmentByIdUseCase {

    Appointment findByAppointmentId(String appointmentId);
}
