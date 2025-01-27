package com.carlosacademic.appoinmentsystem.usecase;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;
import com.carlosacademic.appoinmentsystem.domain.repository.AppointmentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CreateAppointmentUseCaseImpl implements CreateAppointmentUseCase{

    private final AppointmentRepositoryPort appointmentRepositoryPort;

    public Appointment create(Appointment appointment){
        return appointmentRepositoryPort.create(appointment);
    }
}
