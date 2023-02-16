package com.tawandev.hexagonal.adapters.in.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerRequest {

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "cpf is required")
    private String cpf;
    @NotBlank(message = "zipCode is required")
    private String zipCode;
}
