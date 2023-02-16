package com.tawandev.hexagonal.application.ports.out;

import com.tawandev.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
