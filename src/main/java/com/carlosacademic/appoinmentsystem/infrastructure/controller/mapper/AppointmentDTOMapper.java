package com.carlosacademic.appoinmentsystem.infrastructure.controller.mapper;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;
import com.carlosacademic.appoinmentsystem.infrastructure.controller.AppointmentRequest;
import com.carlosacademic.appoinmentsystem.infrastructure.controller.AppointmentResponse;

import java.util.UUID;

public class AppointmentDTOMapper {

    public static Appointment toEntity(AppointmentRequest request){
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(UUID.randomUUID().toString());
        appointment.setAppointmentDate(request.getAppointmentDate());
        appointment.setUserEmail(request.getUserEmail());

        return appointment;
    }

    public static AppointmentResponse toAppointmentResponse(Appointment appointment){
        AppointmentResponse response = new AppointmentResponse();
        response.setAppointmentId(appointment.getAppointmentId());
        response.setAppointmentDate(appointment.getAppointmentDate());
        response.setUserEmail(appointment.getUserEmail());

        return response;
    }
}
