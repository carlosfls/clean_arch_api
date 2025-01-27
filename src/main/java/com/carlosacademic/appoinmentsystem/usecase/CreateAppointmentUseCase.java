package com.carlosacademic.appoinmentsystem.usecase;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;

public interface CreateAppointmentUseCase {

    Appointment create(Appointment appointment);
}
