package com.carlosacademic.appoinmentsystem.usecase;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;
import com.carlosacademic.appoinmentsystem.domain.repository.AppointmentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindAppointmentByIdUseCaseImpl implements FindAppointmentByIdUseCase {

    private final AppointmentRepositoryPort appointmentRepositoryPort;

    @Override
    public Appointment findByAppointmentId(String appointmentId) {
        return appointmentRepositoryPort.findByAppointmentId(appointmentId);
    }
}
