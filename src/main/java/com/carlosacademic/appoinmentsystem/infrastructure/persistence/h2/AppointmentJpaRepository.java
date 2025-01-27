package com.carlosacademic.appoinmentsystem.infrastructure.persistence.h2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppointmentJpaRepository extends JpaRepository<AppointmentEntity, Long> {

    Optional<AppointmentEntity> findByAppointmentId(String appointmentId);
}
