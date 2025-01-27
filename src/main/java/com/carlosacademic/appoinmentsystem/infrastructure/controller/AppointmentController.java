package com.carlosacademic.appoinmentsystem.infrastructure.controller;

import com.carlosacademic.appoinmentsystem.domain.model.Appointment;
import com.carlosacademic.appoinmentsystem.infrastructure.controller.mapper.AppointmentDTOMapper;
import com.carlosacademic.appoinmentsystem.usecase.CreateAppointmentUseCase;
import com.carlosacademic.appoinmentsystem.usecase.FindAppointmentByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/appointments")
@RestController
public class AppointmentController {

    private final CreateAppointmentUseCase createAppointmentUseCase;
    private final FindAppointmentByIdUseCase findAppointmentByIdUseCase;

    @PostMapping
    public ResponseEntity<AppointmentResponse> create(@RequestBody AppointmentRequest request){
        Appointment created = createAppointmentUseCase.create(AppointmentDTOMapper.toEntity(request));
        AppointmentResponse response = AppointmentDTOMapper.toAppointmentResponse(created);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<AppointmentResponse> findByAppointmentId(@RequestParam String appointmentId){
        Appointment appointment = findAppointmentByIdUseCase.findByAppointmentId(appointmentId);
        return new ResponseEntity<>(AppointmentDTOMapper.toAppointmentResponse(appointment), HttpStatus.OK);
    }
}
