package com.tawandev.hexagonal.adapters.in.controller.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}
