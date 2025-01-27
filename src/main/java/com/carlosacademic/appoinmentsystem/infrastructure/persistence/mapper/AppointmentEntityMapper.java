package com.carlosacademic.appoinmentsystem.infrastructure.persistence.mapper;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;
import com.carlosacademic.appoinmentsystem.infrastructure.persistence.h2.AppointmentEntity;

import java.time.LocalDate;
import java.util.UUID;

public class AppointmentEntityMapper {

    public static Appointment toModel(AppointmentEntity entity){
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(entity.getAppointmentId());
        appointment.setAppointmentDate(entity.getAppointmentDate());
        appointment.setUserEmail(entity.getUserEmail());

        return appointment;
    }

    public static AppointmentEntity toEntity(Appointment appointment){
        AppointmentEntity entity = new AppointmentEntity();
        entity.setAppointmentId(appointment.getAppointmentId());
        entity.setAppointmentDate(appointment.getAppointmentDate());
        entity.setUserEmail(appointment.getUserEmail());

        return entity;
    }
}
