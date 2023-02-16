package com.tawandev.hexagonal.adapters.in.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardError> objectNotFoundException(NotFoundException exception, HttpServletRequest request) {
        String exceptionMessage = "Not Found";
        StandardError error = new StandardError(
                Instant.now(), HttpStatus.NOT_FOUND.value(), exceptionMessage, exception.getMessage(), request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
