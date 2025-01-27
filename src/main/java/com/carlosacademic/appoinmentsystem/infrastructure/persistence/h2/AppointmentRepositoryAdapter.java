package com.carlosacademic.appoinmentsystem.infrastructure.persistence.h2;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;
import com.carlosacademic.appoinmentsystem.domain.model.NotFoundException;
import com.carlosacademic.appoinmentsystem.domain.repository.AppointmentRepositoryPort;
import com.carlosacademic.appoinmentsystem.infrastructure.persistence.mapper.AppointmentEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppointmentRepositoryAdapter implements AppointmentRepositoryPort {

    private final AppointmentJpaRepository appointmentJpaRepository;

    @Override
    public Appointment create(Appointment appointment) {
        AppointmentEntity saved = appointmentJpaRepository.save(AppointmentEntityMapper.toEntity(appointment));
        return AppointmentEntityMapper.toModel(saved);
    }

    @Override
    public Appointment findByAppointmentId(String appointmentId) {
        return appointmentJpaRepository.findByAppointmentId(appointmentId)
                .map(AppointmentEntityMapper::toModel)
                .orElseThrow(() -> new NotFoundException("Appointment not found"));
    }
}
