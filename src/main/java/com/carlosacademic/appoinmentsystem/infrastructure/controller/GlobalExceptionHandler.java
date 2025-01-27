package com.carlosacademic.appoinmentsystem.infrastructure.controller;

import com.carlosacademic.appoinmentsystem.domain.model.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> notFound(NotFoundException e){
        ErrorResponse response = ErrorResponse.builder(e, HttpStatus.NOT_FOUND, e.getMessage())
                .title("NOT FOUND")
                .build();

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
